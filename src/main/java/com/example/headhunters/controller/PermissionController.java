package com.example.headhunters.controller;

import com.example.headhunters.dto.request.PermissionReqDTO;
import com.example.headhunters.dto.response.PermissionResDTO;
import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.entities.Permission;
import com.example.headhunters.service.PermissionService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permission")
@RequiredArgsConstructor
public class PermissionController {
    private final PermissionService permissionService;
    @GetMapping
    public List<PermissionResDTO> getAllPermission(){
        return permissionService.getPermissionsList();
    }

    @GetMapping("/{id}")
    public PermissionResDTO getPermissionById(@PathVariable Integer id){
        return permissionService.getPermissionById(id);
    }


    @GetMapping("/permission_id/{id}")
    public List<RoleResDTO> getRoleByPermission(@PathVariable Integer id){
        return permissionService.getPermissionRole(id);
    }


    @PostMapping
    public PermissionResDTO createPermission(@RequestBody PermissionReqDTO permissionReqDTO){
        return permissionService.createPermission(permissionReqDTO);
    }

    @PutMapping("/{id}")
    public PermissionResDTO updatePermission(@PathVariable Integer id,@RequestBody PermissionReqDTO permissionReqDTO){
        return permissionService.updatePermission(id,permissionReqDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        permissionService.deletePermission(id);
    }
}
