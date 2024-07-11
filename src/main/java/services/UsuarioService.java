package services;
import model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements InterfaceUsuarioService{

    public ArrayList<Usuario>listaDeUsuarios=new ArrayList<Usuario>();

    @Override
    public void agregar(Usuario nuevoUsuario)   {
        listaDeUsuarios.add(nuevoUsuario);
    }

    @Override
    public List<Usuario> listar() {

        return listaDeUsuarios;
    }


}
