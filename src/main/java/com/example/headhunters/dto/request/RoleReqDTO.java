package com.example.headhunters.dto.request;

import com.example.headhunters.dto.response.PermissionResDTO;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleReqDTO {
    String role_name;
    Set<PermissionResDTO> permissionList;
}
