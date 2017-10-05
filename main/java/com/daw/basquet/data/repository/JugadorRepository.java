package com.daw.basquet.data.repository;

import com.daw.basquet.data.domain.Equipo;
import com.daw.basquet.data.domain.EstadisticasPosicion;
import com.daw.basquet.data.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador> findByNombreContaining(String nombre);

    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);

    List<Jugador> findByPosicion(String posicion);

    List<Jugador> findByFechaNacimientoBetween(LocalDate min, LocalDate max);

    List<Jugador> findByFechaNacimientoBefore(LocalDate fecha);


    @Query("SELECT new com.daw.basquet.data.domain.EstadisticasPosicion (j.posicion, avg(j.numCanastas), avg(j.numAsistencias), avg(j.numRebotes)) FROM Jugador j GROUP BY j.posicion")
    List<EstadisticasPosicion> mostrarMedia();


    @Query("select new com.daw.basquet.data.domain.EstadisticasPosicion " +
            "(j.posicion, avg(j.numCanastas), max(j.numCanastas), min(j.numCanastas)," +
            " avg(j.numAsistencias), max(j.numAsistencias), min(j.numAsistencias)," +
            " avg(j.numRebotes), max(j.numRebotes), min(j.numRebotes)) " +
            " from Jugador j group by j.posicion")
    List<EstadisticasPosicion> EstadisticasCompletas();

    List<Jugador> findByEquipo(Equipo equipo);

    List<Jugador> findByEquipoNombre(String nombre);


    // Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición
    // (parámetro adicional de la consulta), por ejemplo, alero.


    List<Jugador> findByEquipoNombreAndPosicion (String nombreEquipo, String posicion);



    //-

    @Query ("SELECT new com.daw.basquet.data.domain.EstadisticasPosicion(jugador.posicion, AVG(jugador.numCanastas), MAX(jugador.numCanastas), MIN(jugador.numCanastas)," +
            " AVG(jugador.numAsistencias), MAX(jugador.numAsistencias),MIN(jugador.numAsistencias)," +
            " AVG(jugador.numRebotes),MAX(jugador.numRebotes),MIN(jugador.numRebotes)) FROM Jugador jugador GROUP BY jugador.posicion")
    List<EstadisticasPosicion> MediaMaxMinCanastasRebotesAsis();


    // media canastas, rebotes y asistencias de los jugadores base

    @Query ("SELECT new com.daw.basquet.data.domain.EstadisticasPosicion(jugador.posicion, AVG(jugador.numCanastas), AVG(jugador.numAsistencias), AVG(jugador.numRebotes)) FROM Jugador jugador GROUP BY jugador.posicion")
    List<EstadisticasPosicion> MediaCanastasRebotesAsis();




    //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.

    @Query("SELECT j.nombre, max(j.numCanastas) FROM Jugador j WHERE j.equipo.nombre= :nombreEquipo")
    List<Object[]> mostrarJugadoresMaxCan(@Param("nombreEquipo") String nombreEquipo);


    Jugador findTopByEquipoNombreOrderByNumCanastasDesc(String nombreEquipo);





}
