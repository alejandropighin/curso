package com.cursojava.curso.controlers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class UsuarioControler {


    @RequestMapping(value = "usuarios/{id}")
    public Usuario getusuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("lucas");
        usuario.setApellido("martinengui");
        usuario.setEmail("loco@gmail.com");
        usuario.setPassword("123123");

        return usuario;

    }
//
//    @RequestMapping(value = "usuario123")
//    public Usuario editar(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("lucas");
//        usuario.setApellido("martinengui");
//        usuario.setEmail("loco@gmail.com");
//        usuario.setPassword("123123");
//
//        return usuario;
//
//    }
//    @RequestMapping(value = "usuario123123")
//    public Usuario eliminar(){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("lucas");
//        usuario.setApellido("martinengui");
//        usuario.setEmail("loco@gmail.com");
//        usuario.setPassword("123123");
//
//        return usuario;
//
//    }
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
