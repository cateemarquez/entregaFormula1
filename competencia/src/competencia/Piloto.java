package competencia;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Piloto {

	static LinkedList<Piloto> pilotos = new LinkedList<Piloto>();
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
		return "PILOTO: " + nombre + " | ESCUDERIA: " + escuderia + " | TIEMPO: " + tiempoVuelta;
	}
	
	
	public static void CargarPilotos() {
		pilotos.add(new Piloto("Max Verstappen", "Red Bull Racing"));
		pilotos.add(new Piloto("Sergio Pérez", "Red Bull Racing"));
		pilotos.add(new Piloto("Charles Leclerc", "Ferrari"));
		pilotos.add(new Piloto("Carlos Sainz", "Ferrari"));
		pilotos.add(new Piloto("Lewis Hamilton", "Mercedes"));
		pilotos.add(new Piloto("George Russell", "Mercedes"));
		pilotos.add(new Piloto("Lando Norris", "McLaren"));
		pilotos.add(new Piloto("Oscar Piastri", "McLaren"));
		pilotos.add(new Piloto("Fernando Alonso", "Aston Martin"));
		pilotos.add(new Piloto("Lance Stroll", "Aston Martin"));
		pilotos.add(new Piloto("Esteban Ocon", "Alpine"));
		pilotos.add(new Piloto("Pierre Gasly", "Alpine"));
		pilotos.add(new Piloto("Yuki Tsunoda", "RB (Visa Cash App RB)"));
		pilotos.add(new Piloto("Daniel Ricciardo", "RB (Visa Cash App RB)"));
		pilotos.add(new Piloto("Valtteri Bottas", "Kick Sauber"));
		pilotos.add(new Piloto("Zhou Guanyu", "Kick Sauber"));	
	}
	
	public static String OrdenDeTiempos() {
		String corredores="";
		
		List <Piloto> ordenados = pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
			for (Piloto pilotos : ordenados) {
			corredores = corredores + pilotos + "\n";
			
			}//fin for
		return corredores;
	}

	
	public static String AutosClasificados() {
		String ganadores = "";
		List<Piloto> rapidos = pilotos.stream()
			    .filter(pilotos -> pilotos.getTiempoVuelta() < 15)
			    .collect(Collectors.toList());
		
			for (Piloto pilotos : rapidos) {
			ganadores = ganadores + pilotos + "\n";
			
			}//fin for
		return ganadores;
	}
	
	public static String Ganador() {
		Piloto ganador = pilotos.stream()
			.min(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			.orElse(null);
		
		return "El piloto más rápido fue: " + ganador;
	}
	
	public static String Perdedor() {
		Piloto perdedor = pilotos.stream()
			.max(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			.orElse(null);
		
		return "El piloto más lento fue: " + perdedor;
	}
	
		

}
