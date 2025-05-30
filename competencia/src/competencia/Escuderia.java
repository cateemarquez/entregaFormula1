package competencia;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Escuderia {

	//clase
	static LinkedList<Escuderia> escuderias = new LinkedList<Escuderia>();
	
	//atributos
	protected String nombre;
	protected LinkedList<Piloto> pilotosPropios = new LinkedList<Piloto>();
	
	//constructor
	public Escuderia(String nombre) {
		this.nombre = nombre;
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

	public LinkedList<Piloto> getPilotos() {
		return pilotosPropios;
	}

	public void setPilotos(LinkedList<Piloto> pilotos) {
		this.pilotosPropios = pilotos;
	}

	@Override
	public String toString() {
		return "ESCUDERIA: " + nombre;
	}
	
	//metodos
	public static void mostrarEscuderias() {
		for (int i = 0; i < getEscuderias().size(); i++) {
			JOptionPane.showMessageDialog(null, getEscuderias().get(i) , "Escuderias de la fecha", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/"+ i +".png")));
		}
		
	
	}

}
