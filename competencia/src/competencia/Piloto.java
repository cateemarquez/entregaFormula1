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
	static LinkedList<Piloto> clasificados = new LinkedList<Piloto>();

	
	//atributos
	protected String nombre;
	protected Escuderia escuderia;
	protected Auto auto;
	protected double tiempoVuelta;
	protected int puntos;
	
	//constructor
	public Piloto(String nombre, Auto auto, Escuderia escuderia) {
		this.nombre = nombre;
		this.auto = auto;
		this.escuderia = escuderia;
		this.tiempoVuelta = Math.random()*15+10;
		this.puntos = 0;
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
	
	public static LinkedList<Piloto> getPilotos() {
		return pilotos;
	}

	public static void setPilotos(LinkedList<Piloto> pilotos) {
		Piloto.pilotos = pilotos;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "PILOTO: " + nombre + " | " + escuderia + " | " + auto + " | TIEMPO: " +String.format("%.4f", tiempoVuelta)   + "\n";
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
		Escuderia.escuderias.get(0).pilotosPropios.add(pilotos.get(0));
		Escuderia.escuderias.get(0).pilotosPropios.add(pilotos.get(1));
		Escuderia.escuderias.get(1).pilotosPropios.add(pilotos.get(2));
		Escuderia.escuderias.get(1).pilotosPropios.add(pilotos.get(3));
		Escuderia.escuderias.get(2).pilotosPropios.add(pilotos.get(4));
		Escuderia.escuderias.get(2).pilotosPropios.add(pilotos.get(5));
		Escuderia.escuderias.get(3).pilotosPropios.add(pilotos.get(6));
		Escuderia.escuderias.get(3).pilotosPropios.add(pilotos.get(7));
		Escuderia.escuderias.get(4).pilotosPropios.add(pilotos.get(8));
		Escuderia.escuderias.get(4).pilotosPropios.add(pilotos.get(9));
		Escuderia.escuderias.get(5).pilotosPropios.add(pilotos.get(10));
		Escuderia.escuderias.get(5).pilotosPropios.add(pilotos.get(11));
		Escuderia.escuderias.get(6).pilotosPropios.add(pilotos.get(12));
		Escuderia.escuderias.get(6).pilotosPropios.add(pilotos.get(13));
		Escuderia.escuderias.get(7).pilotosPropios.add(pilotos.get(14));
		Escuderia.escuderias.get(7).pilotosPropios.add(pilotos.get(15));

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

	public static LinkedList<Piloto> autosClasificadosRapida() {
		//variables
		String ganadores = "";
		int check=0;
		
		List <Piloto> ordenados = pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
			for (Piloto piloto : ordenados) {
				if (check<8) {
					ganadores = ganadores + piloto + "\n";
					check++;
				clasificados.add(piloto);
				}
			}
			
			JOptionPane.showMessageDialog(null, ganadores, "Clasificados", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
			
		return clasificados;
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
	
	public static String topTresRapida() {
		//variables
		String top = "";
		int check=0;
		
		List <Piloto> ordenados = pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
		for (Piloto piloto : ordenados) {
			if (check<3) {
				top = top + piloto + "\n";
				check++;
			}
		}
		return "El top 3 de los corredores mas rapidos es:\n" + top;
	}
	
	public static void correr() {
		// VUELTA RAPIDA
		//variables
		String opcion="";
		String[] minimenu = {"Ganador", "Perdedor", "Top 3", "Siguiente"};
		
		JOptionPane.showMessageDialog(null, "Comenzamos con una vuelta rapida, a ver que corredores clasificaran! Se preparan en la \npista para ver quien pasara a la siguiente fase!", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, "Los tiempos de los 16 pilotos fueron.." + "\n" + ordenDeTiemposRapida(), "Vueltas de los pilotos", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		JOptionPane.showMessageDialog(null, "Los 8 que pasan a siguiente fase..", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
		autosClasificadosRapida();
		
		do {
		opcion = (String)JOptionPane.showInputDialog(null, "Elija el resultado que desea ver..", "Resultados", 0, new ImageIcon(Main.class.getResource("/img/f1.png")), minimenu, minimenu[0]);
		switch (opcion) {
		case "Ganador":
			JOptionPane.showMessageDialog(null, ganadorRapida(), "Ganador", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
			break;
		case "Perdedor":
			JOptionPane.showMessageDialog(null, perdedorRapida(), "Perdedor", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
			break;
		case "Top 3":
			JOptionPane.showMessageDialog(null, topTresRapida(), "Top 3", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
			break;
		}
		} while (!opcion.equals("Siguiente"));
		
		JOptionPane.showMessageDialog(null, "Pasamos a la siguiente fase! Una carrera de tres vueltas!!", "Carrera", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
	
		// CARRERA
		correrCarrera();
		
	}	
	
	public static void mostrarPilotos() {
		String eleccion;
		//variables
		String [] menu = {"Red Bull Racing", "Ferrari", "Mercedes", "McLaren", "Aston Martin", "Alpine", "RB (Visa Cash App RB)", "Kick Sauber"};

		eleccion = (String)JOptionPane.showInputDialog(null, "Seleccione la escuderia de la cual desea ver los pilotos:", "Seleccion", 0, new ImageIcon(Main.class.getResource("/img/f1.png")), menu, menu[0]);
		
		for (int i = 0; i < Escuderia.escuderias.size(); i++) {
			if (Escuderia.escuderias.get(i).getNombre().equals(eleccion)) {
				JOptionPane.showMessageDialog(null, "Los pilotos de la escuderia " + eleccion + " son: \n" + Escuderia.escuderias.get(i).pilotosPropios, "Pilotos por escuderia.", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));			
				}
		}

	}

	
	public static void correrCarrera() {
		int check=0;
		String puntaje = "";
				
		//inicio
		JOptionPane.showMessageDialog(null, "Preparense, la carrera esta por comenzar!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		do {
			JOptionPane.showMessageDialog(null, "Arrancaron! Ronda " + (check+1), "Comenzo la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
			//vueltas
			for (int i = 0; i < clasificados.size(); i++) {
			clasificados.get(i).setPuntos(clasificados.get(i).getPuntos() + (int)(Math.random()*10+3));
			puntaje = puntaje + "PILOTO: " + clasificados.get(i).getNombre() + " | " + clasificados.get(i).getEscuderia() + " | PUNTOS: "  + clasificados.get(i).getPuntos() + "\n";
			}
			//puntos por vuelta
			JOptionPane.showMessageDialog(null, "Los puntos de esta ronda son: \n" + puntaje, "Puntaje", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
			puntaje = "";
			check++;
		} while (check<3);
		
		//resultados
		JOptionPane.showMessageDialog(null, "La carrera ha finalizado!", "Resultados de la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		//ranking
		String corredores="";
		
		List <Piloto> ordenados = clasificados.stream()
			    .sorted(Comparator.comparingInt(Piloto::getPuntos).reversed())
			    .collect(Collectors.toList());
		
			for (Piloto pilotos : ordenados) {
			corredores = corredores + pilotos + " PUNTOS: " + pilotos.getPuntos() +"\n";
			}
			JOptionPane.showMessageDialog(null, "Estos fueron los resultados! \n " + corredores, "Resultados de la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		//ganador
		Piloto ganador = clasificados.stream()
				.max(Comparator.comparingInt(Piloto::getPuntos))
				.orElse(null);
		JOptionPane.showMessageDialog(null, "El ganador de la carrera es: " + ganador + " \n con " + ganador.getPuntos() + " puntos.", "Resultados de la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
	}
	
}
