package cabral.ignacio;

public class TarjetaRoja {
	private Jugador jugador;
	private String minutoDeAmonestacion;

	public TarjetaRoja(Jugador jugador, String minutoDeAmonestacion) {

		this.jugador = jugador;
		this.minutoDeAmonestacion = minutoDeAmonestacion;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public String getMinutoDeAmonestacion() {
		return minutoDeAmonestacion;
	}

	public void setMinutoDeAmonestacion(String minutoDeAmonestacion) {
		this.minutoDeAmonestacion = minutoDeAmonestacion;
	}

}
