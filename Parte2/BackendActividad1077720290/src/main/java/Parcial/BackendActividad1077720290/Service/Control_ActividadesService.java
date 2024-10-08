package Parcial.BackendActividad1077720290.Service;

import Parcial.BackendActividad1077720290.Entity.Control_Actividades;


import Parcial.BackendActividad1077720290.IRepository.IBaseRepository;
import Parcial.BackendActividad1077720290.IRepository.IControl_ActRepository;
import Parcial.BackendActividad1077720290.IService.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Control_ActividadesService extends ABaseService<Control_Actividades> implements IBaseService<Control_Actividades> {
    @Override
    protected IBaseRepository<Control_Actividades, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IControl_ActRepository repository;
}
