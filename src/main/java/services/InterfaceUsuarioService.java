package services;


import model.Usuario;

import java.util.List;

public interface InterfaceUsuarioService {

    void agregar(Usuario nuevoUsuario);

    List<Usuario>listar();
}
