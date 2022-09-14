package cabral.ignacio;

import org.junit.Assert;
import org.junit.Test;

public class FutsalTest {

	Equipo equipo1 = new Equipo();
	Equipo equipo2 = new Equipo();

	Jugador jugador1 = new Jugador(123.2, 22);
	Jugador jugador2 = new Jugador(333.1, 19);
	Jugador jugador3 = new Jugador(2000.21, 30);
	Jugador jugador4 = new Jugador(333.33, 22);
	Jugador jugador5 = new Jugador(456.12, 18);
	Jugador jugador6 = new Jugador(233.66, 28);
	Jugador jugador7 = new Jugador(33.39, 23);
	Jugador jugador8 = new Jugador(225.9, 22);
	Jugador jugador9 = new Jugador(292.00, 21);
	Jugador jugador10 = new Jugador(2341.23, 27);

	@Test
	public void sePuedenAgregarJugadoresAlEquipo() {
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);

		Integer cantidadJugadores = equipo1.getListaDeJugadores().size();
		Integer valorEsperadoCantJugadores = 5;

		Assert.assertEquals(valorEsperadoCantJugadores, cantidadJugadores);
	}

	@Test
	public void sePuedeCalcularElValorDelEquipo() {
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);

		Double valorEquipo = equipo1.getValorTotalDelEquipo();

		Double valorEsperadoEquipo1 = 3245.96;

		Assert.assertEquals(valorEsperadoEquipo1, valorEquipo);
	}

	@Test
	public void sePuedeCalcularLaEdadPromedioDeUnEquipo() {
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		Double edadPromedio = equipo1.getEdadPromedioDeEquipo();
		Double edadPromedioEsperada = 22.2;

		Assert.assertEquals(edadPromedioEsperada, edadPromedio);
	}

	@Test
	public void sePuedeIniciarUnPartidoYRegistrarGoles() {
		Partido partido1 = new Partido(equipo1, equipo2);
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);

		Gol gol1 = new Gol(jugador1, "42:42");
		Gol gol2 = new Gol(jugador6, "77:50");

		partido1.registraGol(gol1);
		partido1.registraGol(gol2);
		Integer cantidadGolesEsperados = 2;
		Integer goles = partido1.getGoles().size();

		Assert.assertEquals(cantidadGolesEsperados, goles);
	}

	@Test
	public void sePuedeSacarAmarillasAJugadoresDeUnEquipo() {
		Partido partido1 = new Partido(equipo1, equipo2);
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);

		TarjetaAmarilla amonestacion = new TarjetaAmarilla(jugador2, "23:23");

		partido1.registraAmarilla(amonestacion);

		Integer cantidadAmarillasEsperadas = 1;
		Integer cantidadAmarillas = partido1.getAmarillas().size();

		Assert.assertEquals(cantidadAmarillasEsperadas, cantidadAmarillas);

	}

	@Test
	public void sePuedeSacarRojasAJugadoresDeUnEquipo() {
		Partido partido1 = new Partido(equipo1, equipo2);
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);

		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);

		TarjetaRoja amonestacion = new TarjetaRoja(jugador3, "13:23");

		partido1.registraRoja(amonestacion);

		Integer cantidadRojasEsperadas = 1;
		Integer cantidadRojas = partido1.getRojas().size();

		Assert.assertEquals(cantidadRojasEsperadas, cantidadRojas);

	}
	//falta refactorizar a una clase de Eventos y validaciones de doble amarillas
}
