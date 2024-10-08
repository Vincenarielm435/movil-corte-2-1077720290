package Parcial.BackendActividad1077720290.Controller;

import Parcial.BackendActividad1077720290.Entity.Control_Actividades;

import Parcial.BackendActividad1077720290.IService.IControl_ActService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Control_Actividades")
public class Control_ActividadesController extends ABaseController<Control_Actividades, IControl_ActService> {
    public Control_ActividadesController(IControl_ActService service) {
        super(service, "Control_Actividades");
    }
}
