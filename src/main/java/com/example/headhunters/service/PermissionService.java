package com.example.headhunters.service;

import com.example.headhunters.dto.request.PermissionReqDTO;
import com.example.headhunters.dto.response.PermissionResDTO;
import com.example.headhunters.dto.response.RoleResDTO;

import java.util.List;

public interface PermissionService {
    PermissionResDTO getPermissionById(Integer id);
    List<PermissionResDTO> getPermissionsList();
    PermissionResDTO createPermission(PermissionReqDTO roleReqDTO);
    PermissionResDTO updatePermission(Integer id, PermissionReqDTO roleReqDTO);
    void deletePermission(Integer id);

    List<RoleResDTO> getPermissionRole(Integer permission_id);
}
