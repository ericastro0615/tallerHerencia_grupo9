public class Hijo extends Padre implements Hermano, Madre {

	private double billetera;
	private Celular celular;
	private String nombre = "Juan Carlos";

	// Constructor de Hijo
	public Hijo(String nombre, Celular celular, Auto auto) {
		super();  // Llama al constructor de Padre
		this.nombre = nombre;
		this.celular = celular;
		this.m_Auto = auto;  // Asigna el auto heredado (m_Auto) al auto del hijo
		this.billetera = 0.0;
	}

	@Override
	public void bailar() {
		System.out.println("Se bailar como mi madre ♪ ♫ ♪");
	}

	@Override
	public void cantar() {
		super.cantar();
		System.out.println("Así canta Juan Carlos");
	}

	public void conducirAuto(Auto autoAmigo) {
		System.out.println("Conduciendo un auto de un amigo (" + autoAmigo.getModelo() + ", patente " + autoAmigo.getPatente() + ")");
	}

	@Override
	public void hacerGol() {

	}

	@Override
	public void jugarFUtbol() {
		System.out.println("Sé jugar fútbol gracias a mi hermano");
	}

	@Override
	public int jugarLoteria() {
		int nroSuerte = 7; // Ejemplo de número de la suerte
		System.out.println("SALIO EL NUMERO DE LA SUERTE " + nroSuerte);
		return nroSuerte;
	}

	public void heredarDinero(double money) {
		this.billetera += money;
		System.out.println("Tío Lucas te regala estos dolaritos! " + money);
	}
}
