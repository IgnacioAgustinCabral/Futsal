package cabral.ignacio;

public class Jugador {

	private Double valor;
	private Integer edad;

	public Jugador(Double valor, Integer edad) {
		this.valor = valor;
		this.edad = edad;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
