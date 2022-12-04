
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//definimos la clase principal
public class CalculaNotas {

//inicializamos la clase main
	public static void main(String[] args) {

		List<Estudiante> Estudiante = new ArrayList<>();
		/*
		 * clase que permite almacenar datos en memoria de forma similar a los Arrays,
		 * con la ventaja de que el numero de elementos que almacena, lo hace de forma
		 * dinámica, es decir, que no es necesario declarar su tamaño como pasa con los
		 * Arrays.
		 */
		// Declaracion de variables
		String nomEst = "";
		float prim_nota, seg_nota, terc_nota, proGeneral = 0;
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
			System.out.println(" \n\n ");
			System.out.println(" 1. REGISTRAR NOTAS POR ALUMNO ");
			System.out.println(" 2. VERIFICAR NOTAS POR ALUMNO ");
			System.out.println(" 3. NOTAS DEFINITIVAS  ALUMNOS ");
			System.out.println(" 4. PROMEDIO ALUM NO APROBADOS ");
			System.out.println(" 5. PROMEDIO ALUMNOS APROBADOS ");
			System.out.println(" 6. PROMEDIO GENERAL DEL CURSO ");
			System.out.println(" 7. AJUSTAR ALUMN NO APROBADOS  ");
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
					nomEst = in.nextLine();
					do {
						System.out.println("Ingrese Primer Nota: ");
						prim_nota = in.nextFloat();
					} while (((prim_nota >= 0) && (prim_nota <= 5)) == false);

					do {
						System.out.println("Ingrese Segunda Nota: ");
						seg_nota = in.nextFloat();
					} while (((seg_nota >= 0) && (seg_nota <= 5)) == false);
					do {
						System.out.println("Ingrese Tercera Nota: ");
						terc_nota = in.nextFloat();
					} while (((terc_nota >= 0) && (terc_nota <= 5)) == false);

					Estudiante.add(new Estudiante(nomEst, prim_nota, seg_nota, terc_nota)); // llamado a la clase
																							// estudiante
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
				case 4: { // PROMEDIO ALUM NO APROBADOS
					// hace el calculo de la nota definitiva del alumno y si esta es menos de 3 lo
					// lista como reprobado
					// y lo almancena para poder calcular la cantidad de reprobados de la clase
					for (int i = 0; i < Estudiante.size(); i++) {
						float definitiva = (float) ((Estudiante.get(i).getNota1() * 0.30)
								+ (Estudiante.get(i).getNota2() * 0.30) + (Estudiante.get(i).getNota3() * 0.40));
						if (definitiva < 3.0) {
							System.out.println("alumno: " + Estudiante.get(i).getNombre() + " "
									+ Estudiante.get(i).getNota1() + " " + Estudiante.get(i).getNota2() + " "
									+ Estudiante.get(i).getNota3() + " = " + definitiva);
							reprobados++;
						}

					}
					System.out.println("De " + Estudiante.size() + " estudiantes, Reprobaron " + reprobados
							+ " que representan el " + ((reprobados * 100) / Estudiante.size()) + "%");
				}
					break;
				case 5: { // PROMEDIO ALUMNOS APROBADOS
					// hace el calculo de la nota definitiva del alumno y si esta es mayor a 3 lo
					// lista como aprobado
					// y lo almancena para poder calcular la cantidad de aprobados de la clase
					for (int i = 0; i < Estudiante.size(); i++) {
						float definitiva = (float) ((Estudiante.get(i).getNota1() * 0.30)
								+ (Estudiante.get(i).getNota2() * 0.30) + (Estudiante.get(i).getNota3() * 0.40));
						if (definitiva >= 3.0) {
							System.out.println("alumno: " + Estudiante.get(i).getNombre() + " "
									+ Estudiante.get(i).getNota1() + " " + Estudiante.get(i).getNota2() + " "
									+ Estudiante.get(i).getNota3() + " = " + definitiva);
							aprobados++;
						}

					}
					System.out.println("De " + Estudiante.size() + " estudiantes, Aprobaron " + aprobados
							+ " que representan el " + ((aprobados * 100) / Estudiante.size()) + "%");
				}
					break;
				case 6: { // PROMEDIO GENERAL DEL CURSO
					// suma las notas definitivas ingresadas y genera el promedio general de la
					// clase.
					for (int i = 0; i < Estudiante.size(); i++) {
						float definitiva = (float) ((Estudiante.get(i).getNota1() * 0.30)
								+ (Estudiante.get(i).getNota2() * 0.30) + (Estudiante.get(i).getNota3() * 0.40));
						proGeneral = proGeneral + definitiva;
					}

					System.out.println("El Promedio General del grupo para : " + Estudiante.size() + " estudiantes es: "
							+ (proGeneral / Estudiante.size()));

				}
					break;
				case 7: { // AJUSTAR ALUMN NO APROBADOS
					// identifica los alunmos reprobados de la clase, luego calcula el 10% de cada
					// una de las notas y lo incrementa en cada una de las notas.
					in.nextLine();

					System.out.print("Indique el nombre del alumno a modificar: ");
					String buscar = in.nextLine();
					for (int i = 0; i < Estudiante.size(); i++) {

						if (Estudiante.get(i).getNombre().contains(buscar)) {
							System.out.println("Tu nota actual: " + Estudiante.get(i).getNombre() + " "
									+ Estudiante.get(i).getNota1() + " " + Estudiante.get(i).getNota2() + " "
									+ Estudiante.get(i).getNota3());
							float definitiva = (float) ((Estudiante.get(i).getNota1() * 0.30)
									+ (Estudiante.get(i).getNota2() * 0.30) + (Estudiante.get(i).getNota3() * 0.40));
							if (definitiva < 3.0) {
								System.out.println("aumentando 10% a tus notas ... ");
								Estudiante.get(i).setNota1(
										(float) (Estudiante.get(i).getNota1() + (0.10 * Estudiante.get(i).getNota1())));
								Estudiante.get(i).setNota2(
										(float) (Estudiante.get(i).getNota2() + (0.10 * Estudiante.get(i).getNota2())));
								Estudiante.get(i).setNota3(
										(float) (Estudiante.get(i).getNota3() + (0.10 * Estudiante.get(i).getNota3())));
							}
						}

					}

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
