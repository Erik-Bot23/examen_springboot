package com.examen.springExamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.springExamen.model.entity.Usuarios;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {
    
} 
