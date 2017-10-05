package com.daw.basquet.data.repository;

import com.daw.basquet.data.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {





    // Consulta los equipos existentes en una localidad determinada.


    List<Equipo> findByLocalidad(String localidad);



    // Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.


    Equipo findByNombre(String nombre);





}
