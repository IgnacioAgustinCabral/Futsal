package cabral.ignacio;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private List<Gol> goles = new ArrayList<>();
	private List<TarjetaAmarilla> amarillas = new ArrayList<>();
	private List<TarjetaRoja> rojas = new ArrayList<>();

	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public List<Gol> getGoles() {
		return goles;
	}

	public void setGoles(List<Gol> goles) {
		this.goles = goles;
	}

	public List<TarjetaAmarilla> getAmarillas() {
		return amarillas;
	}

	public void setAmarillas(List<TarjetaAmarilla> amarillas) {
		this.amarillas = amarillas;
	}

	public List<TarjetaRoja> getRojas() {
		return rojas;
	}

	public void setRojas(List<TarjetaRoja> rojas) {
		this.rojas = rojas;
	}

	public void registraGol(Gol gol) {
		this.getGoles().add(gol);
	}

	public void registraAmarilla(TarjetaAmarilla amarilla) {
		this.getAmarillas().add(amarilla);

	}

	public void registraRoja(TarjetaRoja amonestacion) {
		this.getRojas().add(amonestacion);

	}

}
