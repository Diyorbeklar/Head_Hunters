package com.example.headhunters.repostroies;

import com.example.headhunters.entities.Permission;
import com.example.headhunters.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepostory extends JpaRepository<Permission,Integer> {
  @Query(value = "SELECT r from Roles r join fetch  Permission p on r.id = p.id where p.id=:id")
    List<Roles> getPermissionsRole(@Param("id") Integer roles_id);
}
