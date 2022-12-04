import java.util.*;

//definimos la clase principal
public class CalculaSueldo {

//inicializamos la clase main
	public static void main(String[] args) {

		List<Empleado> empleado = new ArrayList<>();
		/*
		 * clase que permite almacenar datos en memoria de forma similar a los Arrays,
		 * con la ventaja de que el numero de elementos que almacena, lo hace de forma
		 * dinámica, es decir, que no es necesario declarar su tamaño como pasa con los
		 * Arrays.
		 */
		// Declaracion de variables
		String nomEmpl = "";
		float Sueldo = 0;
		int Opcion, reprobados = 0;
		int aprobados = 0;
		boolean salir = false;
		// inicializacion metodo escanner
		Scanner in = new Scanner(System.in); // Inicializamos scanner para leer numeros

		// Este while, permite mostrar el menu en un ciclo continuo hasta que la opcion
		// salir sea falsa la cual esta dentro del menu en la opcion 8
		while (!salir) {

			System.out.println(" **************************************** ");
			System.out.println(" ***************** MENU ***************** ");
			System.out.println(" **************************************** ");
			System.ou0t.println(" \n\n ");
			System.out.println(" 1. REGISTRAR NOTAS POR ALUMNO ");
			System.out.println(" 2. VERIFICAR NOTAS POR ALUMNO ");
			System.out.println(" 3. NOTAS DEFINITIVAS  ALUMNOS ");
			System.out.println(" 8. SALIR DE LA APLICACION ");

			try { // permite capturar cuando el valor ingresado no corresponde al menu o a un
					// numero valido

				Opcion = in.nextInt();

				switch (Opcion) {

				case 1: { // REGISTRAR NOTAS POR ALUMNO
					// Inicialmente capturamos los datos del estudiante y las notas para luego
					// enviarlas como parametros a la clase estudiante
					// la cual contiene la logica para manejar el arraylist

					in.nextLine();
					System.out.println("Ingrese Nombre: ");
					nomEmpl = in.nextLine();
					empleado.add(new Empleado(nomEmpl)); 
				}
					break;

				case 2: // VERIFICAR NOTAS POR ALUMNO
					// permite recorrer el arreglo y muestra la informacion ingresada

					for (int i = 0; i < Estudiante.size(); i++) {
						System.out.println(
								"alumnos: " + Estudiante.get(i).getNombre() + " " + Estudiante.get(i).getNota1() + " "
										+ Estudiante.get(i).getNota2() + " " + Estudiante.get(i).getNota3());
					}
					break;

				case 3: // NOTAS DEFINITIVAS ALUMNOS
					// realiza el recorrido del arreglo tomando las notas del estudiente y
					// calculando el promedio ponderado.
					for (int i = 0; i < Estudiante.size(); i++) {
						float definitiva = (float) ((Estudiante.get(i).getNota1() * 0.30)
								+ (Estudiante.get(i).getNota2() * 0.30) + (Estudiante.get(i).getNota3() * 0.40));
						System.out.println("alumno: " + Estudiante.get(i).getNombre() + " "
								+ Estudiante.get(i).getNota1() + " " + Estudiante.get(i).getNota2() + " "
								+ Estudiante.get(i).getNota3() + " = " + definitiva);
					}
					break;
			
				case 8: { // SALIR DE LA APLICACION
					salir = true;
					System.out.println("Salida del programa");
					in.close();
				}
					break;
				default:
					System.out.println("La opcion ingresada no es valida, intenta nuevamente");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un numero");
				in.next();
			}
			in.ioException();
		}

	}

}
