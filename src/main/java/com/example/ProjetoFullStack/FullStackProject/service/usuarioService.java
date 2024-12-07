package com.example.ProjetoFullStack.FullStackProject.service;

import com.example.ProjetoFullStack.FullStackProject.DTO.usuarioDTO;
import com.example.ProjetoFullStack.FullStackProject.entity.usuarioEntity;
import com.example.ProjetoFullStack.FullStackProject.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioService {

    @Autowired
    private static usuarioRepository usuariorepository;

    public static List<usuarioDTO> listarTodos() {

        List<usuarioEntity> usuarios = usuariorepository.findAll();
        return usuarios.stream().map(usuarioDTO:: new).toList();

    }
    public void inserir (usuarioDTO usuario){

        usuarioEntity usuarioentity = new usuarioEntity(usuario);
        usuariorepository.save(usuarioentity);

    }

    public usuarioDTO alterar(usuarioDTO usuario){
        usuarioEntity usuarioentity = new usuarioEntity(usuario);

        return new usuarioDTO(usuariorepository.save(null));
    }

    public void excluir(Long id){
        usuarioEntity usuario = usuariorepository.findById(id).get();
        usuariorepository.delete(usuario);

    }
}
