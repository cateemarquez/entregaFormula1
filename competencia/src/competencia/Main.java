package competencia;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido a la F1!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		Piloto.pilotos.add(new Piloto( "Max Verstappen", "Red Bull Racing"));
		Piloto.pilotos.add(new Piloto("Sergio Pérez", "Red Bull Racing"));
		Piloto.pilotos.add(new Piloto("Charles Leclerc", "Ferrari"));
		Piloto.pilotos.add(new Piloto("Carlos Sainz", "Ferrari"));
		Piloto.pilotos.add(new Piloto("Lewis Hamilton", "Mercedes"));
		Piloto.pilotos.add(new Piloto("George Russell", "Mercedes"));
		Piloto.pilotos.add(new Piloto("Lando Norris", "McLaren"));
		Piloto.pilotos.add(new Piloto("Oscar Piastri", "McLaren"));
		Piloto.pilotos.add(new Piloto("Fernando Alonso", "Aston Martin"));
		Piloto.pilotos.add(new Piloto("Lance Stroll", "Aston Martin"));
		Piloto.pilotos.add(new Piloto("Esteban Ocon", "Alpine"));
		Piloto.pilotos.add(new Piloto("Pierre Gasly", "Alpine"));
		Piloto.pilotos.add(new Piloto("Yuki Tsunoda", "RB (Visa Cash App RB)"));
		Piloto.pilotos.add(new Piloto("Daniel Ricciardo", "RB (Visa Cash App RB)"));
		Piloto.pilotos.add(new Piloto("Valtteri Bottas", "Kick Sauber"));
		Piloto.pilotos.add(new Piloto("Zhou Guanyu", "Kick Sauber"));
		String corredores="";
		
		List <Piloto> ordenados = Piloto.pilotos.stream()
			    .sorted(Comparator.comparingDouble(Piloto::getTiempoVuelta))
			    .collect(Collectors.toList());
		
		for (Piloto pilotos : ordenados) {
			corredores = corredores + pilotos + "\n";
			
		}
		JOptionPane.showMessageDialog(null, corredores);

	}

}
