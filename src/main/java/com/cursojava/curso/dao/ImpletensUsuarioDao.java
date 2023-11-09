package com.cursojava.curso.dao;


import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


//aca se hacen las querys
@Service
public class ImpletensUsuarioDao {

   //antes se trabajaba con entity manager , pero ahora ya se puede realizar las querys asi
    private final UsuarioDao usuarioDao;

    @Autowired
    public ImpletensUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public List<Usuario> getUsuarios(){
        return this.usuarioDao.findAll();
    }



    public void deleteUser(Long id) {
        usuarioDao.deleteById(id);
    }
}
