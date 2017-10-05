package com.daw.basquet.data.service;


import com.daw.basquet.data.domain.Equipo;
import com.daw.basquet.data.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daw.basquet.data.repository.EquipoRepository;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testEquipo() {


        Equipo fcb = new Equipo(
                "Fcbarcelona",
                "Barcelona",
                LocalDate.of(1899, 2, 3)


        );

        equipoRepository.save(fcb);

        Equipo madrid = new Equipo(
                "Real Madrid",
                "Madrid",
                LocalDate.of(1930, 6, 2)


        );
        equipoRepository.save(madrid);


        Equipo espanyol = new Equipo(
                "RCDEspanyol",
                "Barcelona",
                LocalDate.of(1949, 9, 2)


        );
        equipoRepository.save(espanyol);


        Equipo sevilla = new Equipo(
                "Sevilla",
                "Sevila",
                LocalDate.of(1869, 7, 10)


        );
        equipoRepository.save(sevilla);


        Equipo alaves = new Equipo(
                "Alaves",
                "Vitoria",
                LocalDate.of(1969, 12, 2)


        );
        equipoRepository.save(alaves);

        System.out.println("Equipos de Barcelona");
        System.out.println(equipoRepository.findByLocalidad("Barcelona"));


        System.out.println("Jugadores de un equipo a partir del nombre del equipo");

        System.out.println(equipoRepository.findByNombre("Real Madrid"));





    }

}
