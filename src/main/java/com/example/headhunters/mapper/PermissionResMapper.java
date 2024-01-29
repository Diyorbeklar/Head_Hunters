package com.example.headhunters.mapper;

import com.example.headhunters.dto.response.PermissionResDTO;
import com.example.headhunters.entities.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionResMapper extends EntityMapper<PermissionResDTO,Permission> {
}
