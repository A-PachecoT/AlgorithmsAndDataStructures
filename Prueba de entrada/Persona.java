public class Persona {
	private String nombre;
	private int edad;
	private char genero; // 'M'(Male), 'N' (Non defined), 'F' (Female)

	public void setearNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

	public void setearEdad(int edad) {
		this.edad = edad;
	}

	public int obtenerEdad() {
		return this.edad;
	}

	public float calcularEdadPromedio(Persona p1, Persona p2, Persona p3) {
		return (float) (p1.obtenerEdad() + p2.obtenerEdad() + p3.obtenerEdad()) / (float) 3.0;
	}

	public static void main(String[] args) {
		Persona juan = new Persona(); // Usando el constructor vacío por defecto
		Persona maria = new Persona();
		Persona jose = new Persona();

		// Registramos las tres personas
		juan.setearNombre("Juan");
		juan.setearEdad(10);
		maria.setearNombre("Maria");
		maria.setearEdad(13);
		jose.setearNombre("Jose");
		jose.setearEdad(21);

		float avg = juan.calcularEdadPromedio(maria, jose, juan);
		System.out.println("El promedio de edades de "
				+ juan.obtenerNombre() + ", "
				+ maria.obtenerNombre() + " y "
				+ jose.obtenerNombre() + " es "
				+ avg);

	}
}
