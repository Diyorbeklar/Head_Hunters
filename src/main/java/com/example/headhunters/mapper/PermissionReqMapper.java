package com.example.headhunters.mapper;

import com.example.headhunters.dto.request.PermissionReqDTO;
import com.example.headhunters.entities.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionReqMapper extends EntityMapper<PermissionReqDTO, Permission>{
}
