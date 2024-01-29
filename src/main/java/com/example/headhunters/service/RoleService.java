package com.example.headhunters.service;

import com.example.headhunters.dto.request.RoleReqDTO;
import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.entities.Roles;

import java.util.List;

public interface RoleService {
    RoleResDTO getRoleById(Integer id);
    List<RoleResDTO> getRolesList();
    RoleResDTO createRole(RoleReqDTO roleReqDTO);
    RoleResDTO updateRole(Integer id, RoleReqDTO roleReqDTO);
    void deleteRole(Integer id);


}
