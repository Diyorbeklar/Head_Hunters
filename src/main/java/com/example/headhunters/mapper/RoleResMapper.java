package com.example.headhunters.mapper;

import com.example.headhunters.dto.response.RoleResDTO;
import com.example.headhunters.entities.Roles;
import org.mapstruct.Mapper;

import javax.management.relation.Role;

@Mapper(componentModel = "spring")
public interface RoleResMapper extends EntityMapper<RoleResDTO, Roles> {
}
