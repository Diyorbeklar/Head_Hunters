package com.example.headhunters.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String role_name;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable( name = "role_permission",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns =  @JoinColumn(name = "permission_id"))
    Set<Permission> permissionList = new HashSet<>();
}
