package cabral.ignacio;

public class Gol {

	private Jugador jugador;
	private String minutoDelGol;

	public Gol(Jugador jugador, String minutoDelGol) {

		this.jugador = jugador;
		this.minutoDelGol = minutoDelGol;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public String getMinutoDelGol() {
		return minutoDelGol;
	}

	public void setMinutoDelGol(String minutoDelGol) {
		this.minutoDelGol = minutoDelGol;
	}

}
