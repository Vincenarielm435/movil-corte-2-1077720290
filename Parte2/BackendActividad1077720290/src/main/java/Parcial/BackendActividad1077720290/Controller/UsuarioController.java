package Parcial.BackendActividad1077720290.Controller;

import Parcial.BackendActividad1077720290.Entity.Usuario;
import Parcial.BackendActividad1077720290.IService.IUsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Usuario")
public class UsuarioController extends ABaseController<Usuario, IUsuarioService> {
    public UsuarioController(IUsuarioService service) {
        super(service, "Usuario");
    }
}

