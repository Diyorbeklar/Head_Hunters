package com.example.headhunters.repostroies;

import com.example.headhunters.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepostory extends JpaRepository<Roles,Integer> {
}
