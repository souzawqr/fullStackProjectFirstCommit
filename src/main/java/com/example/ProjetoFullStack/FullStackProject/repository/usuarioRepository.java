package com.example.ProjetoFullStack.FullStackProject.repository;

import com.example.ProjetoFullStack.FullStackProject.DTO.usuarioDTO;
import com.example.ProjetoFullStack.FullStackProject.entity.usuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface usuarioRepository extends JpaRepository<usuarioEntity, Long> {

}
