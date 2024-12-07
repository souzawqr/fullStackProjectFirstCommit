package com.example.ProjetoFullStack.FullStackProject.controller;

import com.example.ProjetoFullStack.FullStackProject.DTO.usuarioDTO;
import com.example.ProjetoFullStack.FullStackProject.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuariosAPI")
public class usuarioController {

    @Autowired
    private usuarioService usuarioservice;

    @GetMapping(value = "/selecionarUsuario")
    public List<usuarioDTO> getUsuario(@RequestBody usuarioDTO usuario){

        return usuarioService.listarTodos();

    }
    @PostMapping(value = "/adicionarUsuario")
    public void addUsuario(@RequestBody usuarioDTO usuario){
        usuarioservice.inserir(usuario);

    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Void> excluir(Long id){

        usuarioservice.excluir(id);
        return ResponseEntity.ok().build();
    }
}
