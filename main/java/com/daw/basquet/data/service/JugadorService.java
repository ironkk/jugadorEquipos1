package com.daw.basquet.data.service;

import com.daw.basquet.data.domain.Equipo;
import com.daw.basquet.data.domain.Jugador;
import com.daw.basquet.data.repository.EquipoRepository;
import com.daw.basquet.data.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;


    public void testJugador() {

        Jugador ibrahim = new Jugador(
                "Ibrahim",
                LocalDate.of(1991, 1, 9),
                8,
                8,
                8,
                "alero"
        );

        Equipo barça = equipoRepository.findByNombre("Fcbarcelona");

        ibrahim.setEquipo(barça);

        jugadorRepository.save(ibrahim);


        Jugador clara = new Jugador(
                "Clara",
                LocalDate.of(1997, 7, 3),
                6,
                10,
                32,
                "alero"
        );

        Equipo sevilla = equipoRepository.findByNombre("Sevilla");

        clara.setEquipo(sevilla);

        jugadorRepository.save(clara);


//        //Demo clase
//        System.out.println("Jugadores del Barça");
////        System.out.println(jugadorRepository.findByEquipoNombre("Fcbarcelona"));
//        System.out.println(jugadorRepository.findByEquipo(barça));


        Jugador juan = new Jugador(
                "Juan",
                LocalDate.of(1990, 9, 1),
                42,
                69,
                2,
                "base"
        );

        Equipo madrid = equipoRepository.findByNombre("Real Madrid");

        juan.setEquipo(madrid);

        jugadorRepository.save(juan);

        Jugador elena = new Jugador(
                "Elena",
                LocalDate.of(1998, 12, 2),
                62,
                23,
                8,
                "base"
        );

        Equipo espanyol = equipoRepository.findByNombre("Fcbarcelona");

        elena.setEquipo(espanyol);

        jugadorRepository.save(elena);

        Jugador pere = new Jugador(
                "Pere",
                LocalDate.of(1999, 1, 5),
                2,
                3,
                8,
                "base"
        );

        Equipo alaves = equipoRepository.findByNombre("Alaves");

        pere.setEquipo(alaves);
        jugadorRepository.save(pere);

//--
        Jugador alvaro = new Jugador(
                "Alvaro",
                LocalDate.of(1981, 7, 8),
                78,
                54,
                12,
                "pivot"
        );


        alvaro.setEquipo(alaves);

        jugadorRepository.save(alvaro);

        Jugador julia = new Jugador(
                "Julia",
                LocalDate.of(1997, 12, 9),
                62,
                10,
                22,
                "alero"
        );


        julia.setEquipo(sevilla);

        jugadorRepository.save(julia);


        Jugador laia = new Jugador(
                "Laia",
                LocalDate.of(1950, 6, 20),
                62,
                20,
                23,
                "base"
        );


        laia.setEquipo(madrid);

        jugadorRepository.save(laia);


        Jugador xavi = new Jugador(
                "Xavi",
                LocalDate.of(1968, 12, 2),
                32,
                83,
                8,
                "base"
        );


        xavi.setEquipo(espanyol);

        jugadorRepository.save(xavi);

        Jugador pedro = new Jugador(
                "Pedro",
                LocalDate.of(1999, 1, 5),
                562,
                12,
                5,
                "base"
        );


        pedro.setEquipo(barça);
        jugadorRepository.save(pedro);

        Jugador cesar = new Jugador(
                "Cesar",
                LocalDate.of(1961, 8, 3),
                9,
                65,
                12,
                "alero"
        );


        cesar.setEquipo(barça);

        jugadorRepository.save(cesar);


        Jugador arnau = new Jugador(
                "Arnau",
                LocalDate.of(1965, 9, 24),
                6,
                16,
                62,
                "alero"
        );


        arnau.setEquipo(sevilla);

        jugadorRepository.save(arnau);


//        //Demo clase
//        System.out.println("Jugadores del Barça");
////        System.out.println(jugadorRepository.findByEquipoNombre("Fcbarcelona"));
//        System.out.println(jugadorRepository.findByEquipo(barça));


        Jugador marcel = new Jugador(
                "Marcel",
                LocalDate.of(1990, 9, 1),
                42,
                69,
                2,
                "base"
        );


        marcel.setEquipo(madrid);

        jugadorRepository.save(marcel);

        Jugador carmen = new Jugador(
                "Carmen",
                LocalDate.of(1978, 12, 3),
                82,
                22,
                3,
                "base"
        );


        carmen.setEquipo(espanyol);

        jugadorRepository.save(carmen);

        Jugador rosa = new Jugador(
                "Rosa",
                LocalDate.of(1999, 1, 5),
                2,
                3,
                8,
                "base"
        );


        rosa.setEquipo(alaves);
        jugadorRepository.save(rosa);

//--
        Jugador ignasi = new Jugador(
                "Ignasi",
                LocalDate.of(1997, 6, 20),
                68,
                53,
                72,
                "pivot"
        );


        ignasi.setEquipo(alaves);

        jugadorRepository.save(ignasi);

        Jugador pablo = new Jugador(
                "Pablo",
                LocalDate.of(1995, 2, 5),
                12,
                19,
                42,
                "alero"
        );


        pablo.setEquipo(madrid);

        jugadorRepository.save(pablo);


        Jugador gerard = new Jugador(
                "Gerard",
                LocalDate.of(1975, 4, 12),
                82,
                45,
                64,
                "base"
        );


        gerard.setEquipo(madrid);

        jugadorRepository.save(gerard);


        Jugador armand = new Jugador(
                "Armand",
                LocalDate.of(1978, 8, 26),
                66,
                3,
                8,
                "base"
        );


        armand.setEquipo(espanyol);

        jugadorRepository.save(armand);

        Jugador anna = new Jugador(
                "Anna",
                LocalDate.of(1968, 9, 2),
                52,
                62,
                5,
                "base"
        );


        anna.setEquipo(barça);
        jugadorRepository.save(anna);


        Jugador aa = new Jugador(
                "aa",
                LocalDate.of(1950, 6, 5),
                42,
                32,
                6,
                "base"
        );


        aa.setEquipo(madrid);

        jugadorRepository.save(aa);

        Jugador bb = new Jugador(
                "bb",
                LocalDate.of(1978, 12, 3),
                82,
                22,
                3,
                "base"
        );


        bb.setEquipo(espanyol);

        jugadorRepository.save(bb);

        Jugador cc = new Jugador(
                "cc",
                LocalDate.of(1999, 1, 5),
                2,
                3,
                8,
                "base"
        );


        cc.setEquipo(alaves);
        jugadorRepository.save(cc);

//--
        Jugador nn = new Jugador(
                "nn",
                LocalDate.of(1997, 6, 20),
                68,
                53,
                72,
                "pivot"
        );


        ignasi.setEquipo(alaves);

        jugadorRepository.save(ignasi);

        Jugador tt = new Jugador(
                "tt",
                LocalDate.of(1995, 10, 5),
                12,
                19,
                42,
                "alero"
        );


        tt.setEquipo(sevilla);

        jugadorRepository.save(tt);


        Jugador qq = new Jugador(
                "qq",
                LocalDate.of(1975, 10, 12),
                82,
                45,
                64,
                "base"
        );


        qq.setEquipo(madrid);

        jugadorRepository.save(qq);


        Jugador yy = new Jugador(
                "yy",
                LocalDate.of(1978, 8, 26),
                66,
                3,
                8,
                "base"
        );


        yy.setEquipo(espanyol);

        jugadorRepository.save(yy);

        Jugador ii = new Jugador(
                "ii",
                LocalDate.of(1968, 9, 2),
                52,
                62,
                5,
                "base"
        );


        ii.setEquipo(barça);
        jugadorRepository.save(ii);

        System.out.println("Jugadores que contengan Cla");
        System.out.println(jugadorRepository.findByNombreContaining("cla"));

        System.out.println("Jugadores que han conseguido mas asistencias de 3 y menos de 20");
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(3, 20));

        System.out.println("Jugadores que han conseguido igual o mas cansatas de 20");
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(20));

        System.out.println("Jugadores que pertenezcan a la posición base");
        System.out.println(jugadorRepository.findByPosicion("base"));

        System.out.println("Jugadores que han nacido antes de 1998");
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1998, 1, 1)));



        //-


        System.out.println("Media Canastas, asistencias y rebotes de los jugadores por posicion");
        System.out.println(jugadorRepository.MediaCanastasRebotesAsis());

        System.out.println("Media max min Canastas, asistencias y rebotes de los jugadores por posicion");
        System.out.println(jugadorRepository.MediaMaxMinCanastasRebotesAsis());

        System.out.println("Jugadores de un equipo de misma posicion");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("Fcbarcelona", "base"));

        System.out.println("Jugador que mas canastas ha realizado de un equipo");
        System.out.println(jugadorRepository.findTopByEquipoNombreOrderByNumCanastasDesc("Real Madrid"));

    }
}
