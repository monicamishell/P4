import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		int opc;
		String nombre, edad, matricula, noSS, noEmpleado, rFC, noJubilado;
		float promedio;

		do{
			System.out.println("[1]Capturar Alumno");
			System.out.println("[2] Capturar Trabajador");
			System.out.println("[3] Capturar Jubilado");
			System.out.println("[0] Salir");
			System.out.println("Opcion: ");
			opc=scanner.nextInt();

				switch(opc)
				{

					case 1: System.out.println("\n----[1]Capturar Alumno----\n");
							scanner.nextLine();
							System.out.println("Ingrese el nombre: ");
							nombre =scanner.nextLine();
							System.out.println("\nIngrese su edad: ");
							edad = scanner.nextLine();
							System.out.println("\nIngrese su matricula: ");
							matricula = scanner.nextLine();
							System.out.println("\nIngrese su promedio: ");
							promedio= scanner.nextFloat();
							scanner.nextLine();
							System.out.println("\nIngrese su numero de seguro social ");
							noSS = scanner.nextLine();

							Alumno alumno1 = new Alumno(nombre, edad, noSS);
							alumno1.setMatricula(matricula);
							alumno1.setPromedio(promedio);
							System.out.println("\nNombre: " +alumno1.getNombre() +"\nEdad: " +alumno1.getEdad() +"\nNo. SS: " +alumno1.getNoSS());
							System.out.println("Matricula: " +alumno1.getMatricula() +"\nPromedio: " +alumno1.getPromedio() +"\n\n");
							break;

					case 2: System.out.println("\n----[2] Capturar Trabajador----\n");
							scanner.nextLine();
							System.out.println("Ingrese el nombre: ");
							nombre = scanner.nextLine();
							System.out.println("\nIngrese su edad: ");
							edad = scanner.nextLine();
							System.out.println("\nIngrese su num. de empleado: ");
							noEmpleado = scanner.nextLine();
							System.out.println("\nIngrese su RFC: ");
							rFC = scanner.nextLine();
							//.nextLine();
							System.out.println("\nIngrese su numero de seguro social ");
							noSS = scanner.nextLine();
							Trabajador trabajador1 = new Trabajador(nombre, edad, noSS);
							trabajador1.setNoEmpleado(noEmpleado);
							trabajador1.setRFC(rFC);
							System.out.println("\nNombre: " +trabajador1.getNombre() +"\nEdad: " +trabajador1.getEdad() +"\nNo. SS: " +trabajador1.getNoSS());
							System.out.println("No. empleado: " +trabajador1.getNoEmpleado() +"\nRFC: " +trabajador1.getRFC() +"\n\n");
							break;

					case 3: System.out.println("\n----[3] Capturar Jubilado----\n");
							scanner.nextLine();
							System.out.println("Ingrese el nombre: ");
							nombre = scanner.nextLine();
							System.out.println("\nIngrese su edad: ");
							edad = scanner.nextLine();
							System.out.println("\nIngrese su num. de jubilado: ");
							noJubilado = scanner.nextLine();
							System.out.println("\nIngrese su RFC: ");
							rFC = scanner.nextLine();
							//scanner.nextLine();
							System.out.println("\nIngrese su numero de seguro social ");
							noSS = scanner.nextLine();
							Jubilado jubilado1 = new Jubilado(nombre, edad, noSS);
							jubilado1.setNoJubilado(noJubilado);
							jubilado1.setRFC(rFC);
							System.out.println("\nNombre: " +jubilado1.getNombre() +"\nEdad: " +jubilado1.getEdad() +"\nNo. SS: " +jubilado1.getNoSS());
							System.out.println("No. jubilado: " +jubilado1.getNoJubilado() +"\nRFC: " +jubilado1.getRFC() +"\n\n");
							break;
				}

		}while(opc!=0);
	}

}