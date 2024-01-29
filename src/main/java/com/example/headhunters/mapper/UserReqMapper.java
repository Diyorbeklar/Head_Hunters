package com.example.headhunters.mapper;

import com.example.headhunters.dto.request.UserReqDTO;
import com.example.headhunters.entities.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserReqMapper extends EntityMapper<UserReqDTO, Users>{
}
