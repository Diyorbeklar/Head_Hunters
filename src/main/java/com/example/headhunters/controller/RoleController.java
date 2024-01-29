package com.example.headhunters.controller;

import com.example.headhunters.dto.request.RoleReqDTO;
import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.mapper.RoleReqMapper;
import com.example.headhunters.mapper.RoleResMapper;
import com.example.headhunters.service.RoleService;
import com.example.headhunters.service.RoleServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;
    @GetMapping
    public List<RoleResDTO> getRoleList(){
        return roleService.getRolesList();
    }

    @GetMapping("/{id}")
    public RoleResDTO getRoleByID(@PathVariable Integer id){
        return roleService.getRoleById(id);
    }

    @PostMapping
    public RoleResDTO createRole(@RequestBody RoleReqDTO roleReqDTO){
        return roleService.createRole(roleReqDTO);
    }

    @PutMapping("/{id}")
    public RoleResDTO updateRole(@PathVariable Integer id,@RequestBody RoleReqDTO roleReqDTO){
        return roleService.updateRole(id,roleReqDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }
}
