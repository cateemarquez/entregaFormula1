package competencia;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String [] menu = {"Ver escuderias", "Vuelta rápida", "Carrera", "Salir"};
		int eleccion = 0;
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la F1!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		do {
			
			eleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee: ", "INICIO", 0, 0,
					new ImageIcon(Main.class.getResource("/img/f1.png")), menu, menu[0]);
			
			switch (eleccion) {
			case 0: //mostrar escuderias
				
				Escuderia.CargarEscuderias();
//				JOptionPane.showMessageDialog(null, Escuderia.MostrarEscuderias() , "Escuderias de la fecha", JOptionPane.DEFAULT_OPTION,
//						new ImageIcon(Main.class.getResource("/img/f1.png")));
				
				break;

			case 1: //vuelta rapida
				
				Piloto.CargarPilotos();
				JOptionPane.showMessageDialog(null, "Arrancan los corredores, se preparan en la \npista para ver quien clasificará!", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				JOptionPane.showMessageDialog(null, "Los tiempos de los 16 pilotos fueron.." + "\n" + Piloto.OrdenDeTiempos(), "Vueltas de los pilotos", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				
				JOptionPane.showMessageDialog(null, "Los 8 que pasan a siguiente fase..", "Vuelta rápida!", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				JOptionPane.showMessageDialog(null,Piloto.AutosClasificados(), "Clasificados", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				
				JOptionPane.showMessageDialog(null, Piloto.Perdedor(), "Perdedor", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				JOptionPane.showMessageDialog(null, Piloto.Ganador(), "Ganador", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				
				break;
				
			case 2: //carrera
	
				break;
				
			case 3: //salir
				
				JOptionPane.showMessageDialog(null, "Gracias, hasta la próxima carrera!!", "Adiós!", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				break;
			}
			
		} while (eleccion!=3);
		
		
		

	}

}
