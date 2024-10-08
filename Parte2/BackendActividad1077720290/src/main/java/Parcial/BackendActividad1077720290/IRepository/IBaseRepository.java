package Parcial.BackendActividad1077720290.IRepository;

import Parcial.BackendActividad1077720290.Entity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T,Long> {
}
