package competencia;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Piloto {

	//clase
	static LinkedList<Piloto> pilotos = new LinkedList<Piloto>();
	
	//atributos
	protected String nombre;
	protected Escuderia escuderia;
	protected Auto auto;
	protected double tiempoVuelta;
	
	//constructor
	public Piloto(String nombre, Auto auto, Escuderia escuderia) {
		super();
		this.nombre = nombre;
		this.auto = auto;
		this.escuderia = escuderia;
		this.tiempoVuelta = Math.random()*15+10;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Escuderia getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(Escuderia escuderia) {
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
		return "PILOTO: " + nombre + " | " + escuderia + " | " + auto + " | TIEMPO: " + tiempoVuelta;
	}
	
	//metodos
	public static void cargaInicial() {
		Auto a1 = new Auto("SF1000");
		Auto a2 = new Auto("SF90");
		Auto a3 = new Auto("SF70H");
		Auto a4 = new Auto("FW47");
		Auto a5 = new Auto("C45");
		Auto a6 = new Auto("F1-68");
		Auto a7 = new Auto("SF350");
		Auto a8 = new Auto("FW10");
		Auto a9 = new Auto("C700");
		Escuderia.escuderias.add(new Escuderia("Red Bull Racing"));
		Escuderia.escuderias.add(new Escuderia("Ferrari"));
		Escuderia.escuderias.add(new Escuderia("Mercedes"));
		Escuderia.escuderias.add(new Escuderia("McLaren"));
		Escuderia.escuderias.add(new Escuderia("Aston Martin"));
		Escuderia.escuderias.add(new Escuderia("Alpine"));
		Escuderia.escuderias.add(new Escuderia("RB (Visa Cash App RB)"));
		Escuderia.escuderias.add(new Escuderia("Kick Sauber"));
		pilotos.add(new Piloto("Max Verstappen", a1, Escuderia.escuderias.get(0)));
		pilotos.add(new Piloto("Sergio Pérez",a2, Escuderia.escuderias.get(0)));
		pilotos.add(new Piloto("Charles Leclerc",a3, Escuderia.escuderias.get(1)));
		pilotos.add(new Piloto("Carlos Sainz",a4, Escuderia.escuderias.get(1)));
		pilotos.add(new Piloto("Lewis Hamilton",a5, Escuderia.escuderias.get(2)));
		pilotos.add(new Piloto("George Russell", a6,Escuderia.escuderias.get(2)));
		pilotos.add(new Piloto("Lando Norris",a7 ,Escuderia.escuderias.get(3)));
		pilotos.add(new Piloto("Oscar Piastri",a8 ,Escuderia.escuderias.get(3)));
		pilotos.add(new Piloto("Fernando Alonso",a9, Escuderia.escuderias.get(4)));
		pilotos.add(new Piloto("Lance Stroll",a3, Escuderia.escuderias.get(4)));
		pilotos.add(new Piloto("Esteban Ocon", a4,Escuderia.escuderias.get(5)));
		pilotos.add(new Piloto("Pierre Gasly",a7,Escuderia.escuderias.get(5)));
		pilotos.add(new Piloto("Yuki Tsunoda",a6 ,Escuderia.escuderias.get(6)));
		pilotos.add(new Piloto("Daniel Ricciardo", a2,Escuderia.escuderias.get(6)));
		pilotos.add(new Piloto("Valtteri Bottas",a9, Escuderia.escuderias.get(7)));
		pilotos.add(new Piloto("Zhou Guanyu",a7 ,Escuderia.escuderias.get(7)));	
	}
	
	public static String ordenDeTiemposRapida() {
		String corredores="";
		
		List <Piloto> ordenados = pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
			for (Piloto pilotos : ordenados) {
			corredores = corredores + pilotos + "\n";
			}//fin for
			
		return corredores;
	}

	public static String autosClasificadosRapida() {
		//variables
		String ganadores = "";
		int check=0;
		
		List <Piloto> ordenados = pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
			for (Piloto pilotos : ordenados) {
				if (check<8) {
					ganadores = ganadores + pilotos + "\n";
					check++;
				}
			
			}//fin for
		return ganadores;
	}
	
	public static String ganadorRapida() {
		Piloto ganador = pilotos.stream()
			.min(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			.orElse(null);
		
		return "El piloto más rápido fue: " + ganador;
	}
	
	public static String perdedorRapida() {
		Piloto perdedor = pilotos.stream()
			.max(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			.orElse(null);
		
		return "El piloto más lento fue: " + perdedor;
	}
	
	public static void correrVueltaRapida() {
		JOptionPane.showMessageDialog(null, "Arrancan los corredores, se preparan en la \npista para ver quien clasificará!", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, "Los tiempos de los 16 pilotos fueron.." + "\n" + Piloto.ordenDeTiemposRapida(), "Vueltas de los pilotos", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, "Los 8 que pasan a siguiente fase..", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, Piloto.autosClasificadosRapida(), "Clasificados", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, Piloto.perdedorRapida(), "Perdedor", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, Piloto.ganadorRapida(), "Ganador", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
	}
	
	

}
