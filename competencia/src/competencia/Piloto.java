package competencia;

public class Piloto {

	protected String nombre;
	protected String escuderia;
	protected double tiempoVuelta;
	
	
	public Piloto(String nombre, String escuderia) {
		super();
		this.nombre = nombre;
		this.escuderia = escuderia;
		this.tiempoVuelta = Math.random()*10+10;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEscuderia() {
		return escuderia;
	}


	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}


	public double getTiempoVuelta() {
		return tiempoVuelta;
	}


	public void setTiempoVuelta(double tiempoVuelta) {
		this.tiempoVuelta = tiempoVuelta;
	}


	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", escuderia=" + escuderia + ", tiempoVuelta=" + tiempoVuelta + "]";
	}
	
	
	

}
