package cabral.ignacio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	List<Jugador> listaDeJugadores = new ArrayList<>();

	public void agregarJugador(Jugador jugador1) {
		this.getListaDeJugadores().add(jugador1);
	}

	public List<Jugador> getListaDeJugadores() {
		return listaDeJugadores;
	}

	public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
		this.listaDeJugadores = listaDeJugadores;
	}

	public Double getValorTotalDelEquipo() {
		Double valorEquipo = 0.0;

		for (Jugador jugador : this.getListaDeJugadores()) {
			valorEquipo += jugador.getValor();
		}

		return valorEquipo;

	}

	public Double getEdadPromedioDeEquipo() {
		Integer edadJugadores = 0;

		for (Jugador jugador : this.getListaDeJugadores()) {
			edadJugadores += jugador.getEdad();
		}

		return (double) edadJugadores / this.getListaDeJugadores().size();
	}

}
