package competencia;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido a la F1!", "Que empiece la carrera!", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Main.class.getResource("/img/f1.png")));
		
	}

}
