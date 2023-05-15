package com.portfolio.mgb.Security.Repository;

import com.portfolio.mgb.Security.Enums.RolNombre;
import com.portfolio.mgb.security.Entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
