package competencia;

public class Auto {
	
	//atributos
	protected String modelo;
	
	//constructor
	public Auto(String modelo) {
		this.modelo = modelo;
	}

	//getters y setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "AUTO: modelo = " + modelo;
	}
	
}
