package com.example.demo;

import model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import services.InterfaceUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioControler {

    private final InterfaceUsuarioService usuarioService;

    @Autowired
    public UsuarioControler(InterfaceUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void  agregar(Usuario nuevoUsuario){
        usuarioService.agregar(nuevoUsuario);
    }

    @GetMapping
    public List<Usuario> getUsuario(){
        return usuarioService.listar();

    }
}
