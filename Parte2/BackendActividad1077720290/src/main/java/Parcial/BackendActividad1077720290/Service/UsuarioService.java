package Parcial.BackendActividad1077720290.Service;

import Parcial.BackendActividad1077720290.Entity.Usuario;
import Parcial.BackendActividad1077720290.IRepository.IBaseRepository;
import Parcial.BackendActividad1077720290.IRepository.IUsuarioRepository;
import Parcial.BackendActividad1077720290.IService.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends ABaseService<Usuario> implements IBaseService<Usuario> {
    @Override
    protected IBaseRepository<Usuario, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUsuarioRepository repository;
}

