package com.example.headhunters.service;

import com.example.headhunters.dto.request.RoleReqDTO;
import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.entities.Permission;
import com.example.headhunters.entities.Roles;
import com.example.headhunters.mapper.RoleReqMapper;
import com.example.headhunters.mapper.RoleResMapper;
import com.example.headhunters.repostroies.RoleRepostory;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class RoleServiceImpl implements RoleService{

    private final RoleReqMapper roleReqMapper;
    private final RoleResMapper roleResMapper;
    private final RoleRepostory roleRepostory;
    @Override
    public RoleResDTO getRoleById(Integer id) {
        return roleResMapper.toDTO(roleRepostory.getReferenceById(id));
    }

    @Override
    public List<RoleResDTO> getRolesList() {
        return roleResMapper.toDTOs(roleRepostory.findAll());
    }

    @Override
    public RoleResDTO createRole(RoleReqDTO roleReqDTO) {
        return roleResMapper.toDTO(roleRepostory.save(roleReqMapper.toEntity(roleReqDTO)));
    }

    @Override
    public RoleResDTO updateRole(Integer id, RoleReqDTO roleReqDTO) {
        Roles roles = roleRepostory.getReferenceById(id);
        roles.setRole_name(roleReqDTO.getRole_name());
        roles.setPermissionList(roleReqDTO.getPermissionList()
                .stream().map(PermissonResDTO -> Permission
                        .builder().id(PermissonResDTO.getId())
                        .permission_name(PermissonResDTO.getPermission_name())
                        .build()).collect(Collectors.toSet()));

        return roleResMapper.toDTO(roleRepostory.save(roles));
    }

    @Override
    public void deleteRole(Integer id) {
        roleRepostory.deleteById(id);
    }
}
