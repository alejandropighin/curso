package com.cursojava.curso.controlers;


import com.cursojava.curso.dao.ImpletensUsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioControler {

    private final ImpletensUsuarioDao impletensUsuarioDao;

    @Autowired
    public UsuarioControler(ImpletensUsuarioDao impletensUsuarioDao) {
        this.impletensUsuarioDao = impletensUsuarioDao;
    }


    @RequestMapping(value = "api/usuarios/{id}")
    public Usuario getusuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("lucas");
        usuario.setApellido("martinengui");
        usuario.setEmail("loco@gmail.com");
        usuario.setPassword("123123");

        return usuario;

    }

    @GetMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
       return this.impletensUsuarioDao.getUsuarios();

    }

    @DeleteMapping(value = "api/usuarios/{id}")
    public void eliminar(@PathVariable Long id){
        impletensUsuarioDao.deleteUser(id);
    }



//    @RequestMapping(value = "usuario123123")
//    public List<Usuario> buscar(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("lucas");
//        usuario.setApellido("martinengui");
//        usuario.setEmail("loco@gmail.com");
//        usuario.setPassword("123123");
//
//        return ;
//
//    }


}
