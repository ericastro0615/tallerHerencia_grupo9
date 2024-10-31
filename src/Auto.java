//ackage Diagrama_de_clases_tallerHerencia;


public class Auto {

	private String color;
	private double combustible = 50;
	private String modelo;
	private String patente;


	/**
	 * 
	 * @param patente
	 * @param modelo
	 */
	public  Auto(String patente, String modelo){
		this.modelo=modelo;
		this.patente=patente;

	}

	public double getCombustible(){
		return combustible;
	}

	public String getModelo(){
		return modelo;
	}

	public String getPatente(){
		return patente;
	}

	public void setModelo(){

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPatente(){
		this.patente=patente;
	}
}//end Auto