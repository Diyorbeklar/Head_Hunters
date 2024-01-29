package com.example.headhunters.mapper;

import com.example.headhunters.dto.request.RoleReqDTO;
import com.example.headhunters.entities.Roles;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
@Mapper(componentModel = "spring")
@Component
public interface RoleReqMapper extends EntityMapper<RoleReqDTO, Roles>{
}
