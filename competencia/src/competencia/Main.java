package competencia;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		//menus y variables
		String [] menu1 = {"Ver escuderias", "Ver pilotos", "Carrera", "Salir"};
		int eleccion1 = 0;
		
		//inicio
		Piloto.cargaInicial();;
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la F1!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/img/f1.png")));
		
		do {
			eleccion1 = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee: ", "INICIO", 0, 0,
					new ImageIcon(Main.class.getResource("/img/f1.png")), menu1, menu1[0]);
			switch (eleccion1) {
			case 0:
				Escuderia.mostrarEscuderias();
				break;				

			case 1: 
				Piloto.mostrarPilotos();
				break;
				
			case 2: 
				Piloto.correr();
				break;
				
			case 3: 
				JOptionPane.showMessageDialog(null, "Gracias, hasta la próxima carrera!", "Adiós!", JOptionPane.DEFAULT_OPTION, new ImageIcon(Main.class.getResource("/img/f1.png")));
				break;
			}
			
		} while (eleccion1!=3);
		
	}

}
