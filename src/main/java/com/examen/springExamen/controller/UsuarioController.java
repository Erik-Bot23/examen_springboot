package com.examen.springExamen.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.springExamen.model.dto.UsuarioResponseDTO;
import com.examen.springExamen.repository.UsuarioRepositorio;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepositorio repo;

    @GetMapping
    public List<UsuarioResponseDTO> getUsuarios(){
        return repo.findAll().stream().map(UsuarioResponseDTO::new).collect(Collectors.toList());
    }
}
