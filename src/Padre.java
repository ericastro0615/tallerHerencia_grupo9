
public class Padre {


	private String apellido ;
	private Auto auto;
	private Casa casa;
	private String nombre ;
	public Casa m_Casa;
	public Auto m_Auto;

	public Padre() {
		this.nombre = "Papá";
		this.apellido = "López";
		construirCasa();
		comprarAuto(m_Auto);
	}

	public void cantar() {
		System.out.println("Asi canta tu padre, Don " + apellido);
	}

	public void comprarAuto(Auto auto) {
		this.auto=m_Auto;
	}

	public void construirCasa() {
		this.m_Casa = new Casa();
	}

	public Auto getAuto() {
		return m_Auto;
	}

	public Casa getCasa() {
		return m_Casa;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Padre{" +
				"apellido='" + apellido + '\'' +
				", auto=" + auto +
				", casa=" + casa +
				", nombre='" + nombre + '\'' +
				", m_Casa=" + m_Casa +
				", m_Auto=" + m_Auto +
				'}';
	}
}//end Padre