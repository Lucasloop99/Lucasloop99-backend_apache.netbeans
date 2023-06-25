package com.portfolio.LELV.Repository;

import com.portfolio.LELV.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    public boolean existsByNombre(String nombre);
    public Optional<Persona> findByNombre(String nombre);
    public Optional<Persona> findById(int id);
    
}
