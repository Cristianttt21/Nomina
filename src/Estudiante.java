/*
 * * ACTIVIDAD 3 - Programa 3 -  Programación Estructurada
 * 
 * Presentado por:		RODRIGO ZUNIGA LOPEZ
 * Identificacion: 		80168000
 * 
 * Un curso de Matemáticas tiene N estudiantes, donde la nota definitiva se calcula mediante 3 cortes,
 * donde el primer corte vale 30%, el segundo corte vale 30% y el tercer corte vale el 40% de la nota 
 * definitiva. Crear un algoritmo que permita almacenar las notas parciales de cada estudiante para 
 * posteriormente saber quiénes aprueban y pierden la materia, así como el promedio de alumnos que pierden
 * la materia.
 * Se deben desarrollar métodos para conocer los estudiantes que pierden la materia, quienes aprueban y el
 * promedio del curso. De igual manera generar un procedimiento que permita aumentar en un 10% las notas 
 * definitivas de los estudiantes que perdieron la materia.
 */

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
