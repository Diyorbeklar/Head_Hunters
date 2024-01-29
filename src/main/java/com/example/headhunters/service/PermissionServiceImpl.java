package com.example.headhunters.service;

import com.example.headhunters.dto.request.PermissionReqDTO;
import com.example.headhunters.dto.response.PermissionResDTO;
import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.entities.Permission;
import com.example.headhunters.mapper.PermissionReqMapper;
import com.example.headhunters.mapper.PermissionResMapper;
import com.example.headhunters.mapper.RoleResMapper;
import com.example.headhunters.repostroies.PermissionRepostory;
import com.example.headhunters.repostroies.RoleRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {
    private final PermissionRepostory permissionRepostory;
    private final PermissionReqMapper permissionReqMapper;
    private final PermissionResMapper permissionResMapper;
    private final RoleResMapper roleResMapper;
    @Override
    public PermissionResDTO getPermissionById(Integer id) {
        return permissionResMapper.toDTO(permissionRepostory.getReferenceById(id));
    }

    @Override
    public List<PermissionResDTO> getPermissionsList() {
        return permissionResMapper.toDTOs(permissionRepostory.findAll());
    }

    @Override
    public PermissionResDTO createPermission(PermissionReqDTO roleReqDTO) {
        return permissionResMapper.toDTO(permissionRepostory.save(permissionReqMapper.toEntity(roleReqDTO)));
    }

    @Override
    public PermissionResDTO updatePermission(Integer id, PermissionReqDTO roleReqDTO) {
        Permission permission = permissionRepostory.getReferenceById(id);
        permission.setPermission_name(roleReqDTO.getPermission_name());
        return permissionResMapper.toDTO(permissionRepostory.save(permission));
    }

    @Override
    public void deletePermission(Integer id) {
       permissionRepostory.deleteById(id);
    }

    @Override
    public List<RoleResDTO> getPermissionRole(Integer permission_id) {
        return roleResMapper.toDTOs(permissionRepostory.getPermissionsRole(permission_id));
    }
}
