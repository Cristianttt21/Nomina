
public class Estudiante {

	private String nombre;   //declara variables a utilizar localmente
	private float nota1, nota2, nota3;

	public Estudiante(String nombre, float nota1, float nota2, float nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
	}

	public String getNombre() {  //permite la captura del valor recibido en el llamado a la clase
		return nombre;
	}

	public void setNombre(String nombre) {  //almacena la informacion recibida en el arreglo
		this.nombre = nombre;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
}
