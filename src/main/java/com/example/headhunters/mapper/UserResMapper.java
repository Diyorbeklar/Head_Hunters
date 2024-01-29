package com.example.headhunters.mapper;

import com.example.headhunters.dto.response.UserResDTO;
import com.example.headhunters.entities.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserResMapper extends EntityMapper<UserResDTO, Users>{
}
