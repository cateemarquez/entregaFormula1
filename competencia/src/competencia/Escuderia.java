package competencia;

import java.util.LinkedList;

public class Escuderia {

	static LinkedList<Escuderia> escuderias = new LinkedList<Escuderia>();
	protected String nombre;
	LinkedList<Integer> puntos = new LinkedList<Integer>();
	
	public Escuderia(String nombre) {
		this.nombre = nombre;
		this.puntos = null;
	}

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

	@Override
	public String toString() {
		return "ESCUDERIA: " + nombre + " | PUNTAJE:" + puntos;
	}
	
	public static void CargarEscuderias() {
		escuderias.add(new Escuderia("Red Bull Racing"));
		escuderias.add(new Escuderia("Ferrari"));
		escuderias.add(new Escuderia("Mercedes"));
		escuderias.add(new Escuderia("McLaren"));
		escuderias.add(new Escuderia("Aston Martin"));
		escuderias.add(new Escuderia("Alpine"));
		escuderias.add(new Escuderia("RB (Visa Cash App RB)"));
		escuderias.add(new Escuderia("Kick Sauber"));
	}
	

	
	
}
