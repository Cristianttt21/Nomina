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
		int Opcion = 0, x=0;
		boolean salir = false;
		// inicializacion metodo escanner
		Scanner in = new Scanner(System.in); // Inicializamos scanner para leer numeros

		// Este while, permite mostrar el menu en un ciclo continuo hasta que la opcion
		// salir sea falsa la cual esta dentro del menu en la opcion 8
		while (!salir) {

			System.out.println(" **************************************** ");
			System.out.println(" ***************** MENU ***************** ");
			System.out.println(" **************************************** ");
			System.out.println(" \n\n ");
			System.out.println(" 1. REGISTRAR EMPLEADO");
			System.out.println(" 2. VERIFICAR LISTA DE EMPLEADOS ");
			System.out.println(" 3. REGISTRAR SALARIO INICIAL ");
			System.out.println(" 8. SALIR DE LA APLICACION ");

			try { // permite capturar cuando el valor ingresado no corresponde al menu o a un
					// numero valido

				Opcion = in.nextInt();

				switch (Opcion) {

				case 1: 
					System.out.println("Por favor ingrese el nombre del primer empleado");
					nomEmpl = in.nextLine();
					in.nextLine();
					if (x==0) {
						System.out.println("Por favor ingrese el salario del primer");
						Sueldo = in.nextFloat();
						x++;
					} else {
						Sueldo = (float) (Sueldo / 0.10 + Sueldo);
						System.out.println(Sueldo);
					}
					empleado.add(new Empleado(nomEmpl, Sueldo));
					break;

				case 2: 
					break;

				case 3: 
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
