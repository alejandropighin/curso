package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UsuarioDao extends JpaRepository<Usuario,Long> {





}
