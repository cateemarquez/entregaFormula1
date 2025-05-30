package competencia;

import java.util.LinkedList;

public class Escuderia {

	//clase
	static LinkedList<Escuderia> escuderias = new LinkedList<Escuderia>();
	
	//atributos
	protected String nombre;
	protected LinkedList<Integer> puntos = new LinkedList<Integer>();
	protected LinkedList<Piloto> pilotos = new LinkedList<Piloto>();
	
	//constructor
	public Escuderia(String nombre) {
		this.nombre = nombre;
		this.puntos = null;
	}

	//getters y setters
	public static LinkedList<Escuderia> getEscuderias() {
		return escuderias;
	}

	public static void setEscuderias(LinkedList<Escuderia> escuderias) {
		Escuderia.escuderias = escuderias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Integer> getPuntos() {
		return puntos;
	}

	public void setPuntos(LinkedList<Integer> puntos) {
		this.puntos = puntos;
	}

	public LinkedList<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(LinkedList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	@Override
	public String toString() {
		return "ESCUDERIA: " + nombre;
	}

}
