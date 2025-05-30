package competencia;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		//menus y variables
		String [] menu = {"Ver escuderias", "Vuelta rápida", "Carrera", "Salir"};
		int eleccion = 0;
		
		//inicio
		Piloto.cargaInicial();;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la F1!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		do {
			eleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee: ", "INICIO", 0, 0,
					new ImageIcon(Main.class.getResource("/img/f1.png")), menu, menu[0]);
			switch (eleccion) {
			case 0: //mostrar escuderias
				for (int i = 0; i < Escuderia.getEscuderias().size(); i++) {
					JOptionPane.showMessageDialog(null, Escuderia.getEscuderias().get(i) , "Escuderias de la fecha", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/"+ i +".png")));
				}
				break;				

			case 1: //vuelta rapida
				Piloto.correrVueltaRapida();
				break;
				
			case 2: //carrera
	
				break;
				
			case 3: //salir
				
				JOptionPane.showMessageDialog(null, "Gracias, hasta la próxima carrera!", "Adiós!", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Main.class.getResource("/img/f1.png")));
				break;
			}
			
		} while (eleccion!=3);
		
	}

}
