package grupnueve;
import java.util.*;
public class Grupal9 {
	
	public class IngresoCapacitacion {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        // Datos de la empresa
			//Verificamos que no queden datos vacios
			
			System.out.print("Ingrese nombre de la empresa: ");
	        String empresa = scanner.nextLine();
		        while (empresa.isEmpty())  {
		            System.out.println("Debe de ingresar el nombre de la empresa:");
		            empresa = scanner.nextLine();
		        }
	        System.out.print("Ingrese el RUT del cliente: ");
	        String rut = scanner.nextLine();
		        while (rut.isEmpty())  {
		            System.out.println("Debe de ingresar el RUT del cliente:");
		            rut = scanner.nextLine();
		        }
	        System.out.print("Ingrese el nombre del cliente: ");
	        String nombreCliente = scanner.nextLine();
		        while (nombreCliente.isEmpty())  {
		            System.out.println("Debe de ingresar el nombre del cliente:");
		            nombreCliente = scanner.nextLine();
		        }
	        System.out.print("Ingrese la dirección del cliente: ");
	        String direccion = scanner.nextLine();
		        while (direccion.isEmpty())  {
		            System.out.println("Debe de ingresar la dirección del cliente:");
		            direccion = scanner.nextLine();
		        }
	        System.out.print("Ingrese la comuna del cliente: ");
	        String comuna = scanner.nextLine();
		        while (comuna.isEmpty())  {
		            System.out.println("Debe de ingresar la comuna del cliente:");
		            comuna = scanner.nextLine();
		        }
	        System.out.print("Ingrese el número de teléfono del cliente: ");
	        String telefono = scanner.nextLine();

		        while (telefono.isEmpty())  {
		            System.out.println("Debe de ingresar el número de teléfono del cliente:");
		            telefono = scanner.nextLine();
		        }

	        // Datos de la capacitación
			
			
			
			System.out.print("Ingrese el nombre capacitación: ");
	        String nombreCapacitacion = scanner.nextLine();
			while (nombreCapacitacion.isEmpty())  {
	            System.out.println("Debe de ingresar el nombre capacitación:");
	            nombreCapacitacion = scanner.nextLine();
				}
			
			System.out.print("Ingrese el día de la capacitación: ");
	        String dia = scanner.nextLine();
		        while (dia.isEmpty())  {
		            System.out.println("Debe de ingresar el día de la capacitación:");
		            dia = scanner.nextLine();
		        }   
	        System.out.print("Ingrese la hora de la capacitación: ");
	        String hora = scanner.nextLine();
		        while (hora.isEmpty())  {
		            System.out.println("Debe de ingresar la hora de la capacitación:");
		            hora = scanner.nextLine();
		        }   
	        System.out.print("Ingrese el lugar de la capacitación: ");
	        String lugar = scanner.nextLine();
		        while (lugar.isEmpty())  {
		            System.out.println("Debe de ingresar el lugar de la capacitación:");
		            lugar = scanner.nextLine();
		        }   
	        System.out.print("Ingrese la duración de la capacitación en horas: ");
	        int duracion = scanner.nextInt();
		        while (duracion <=0)  {
		            System.out.println("Debe de ingresar duración la capacitación en horas:");
		            duracion = scanner.nextInt();
		        }   
	        System.out.print("Ingrese la cantidad de asistentes: ");
	        int cantidadAsistentes = scanner.nextInt(); 
		        while (cantidadAsistentes <= 0) {
		            System.out.println("La cantidad de asistentes debe ser mayor que cero. Ingrese nuevamente:");
		            cantidadAsistentes = scanner.nextInt();
		        }
	              
	        int edadAsistente;
	        int menores25 = 0;
	        int entre26y35 = 0;
	        int mayores35 = 0;
	        
	        
	        
	        for (int i = 0; i < cantidadAsistentes; i++) {
	            System.out.println("Datos del asistente " + (i + 1) + ":");
	            System.out.print("Ingrese el nombre del asistente: ");
	            String nombreAsistente = scanner.next();
	            System.out.print("Ingrese la edad del asistente: ");
	            edadAsistente = scanner.nextInt();
	            scanner.nextLine();
	            if (edadAsistente < 25) {
	                menores25++;
	            } else if (edadAsistente >= 26 && edadAsistente <= 35) {
	                entre26y35++;
	            } else if (edadAsistente > 35) {
	                mayores35++;
	            }
	        }
	            
	           
	          

	        // Mostrar los datos
	        System.out.println("\nDatos de la empresa:");
	        System.out.println("Empresa: " + empresa);
	        System.out.println("Día: " + dia);
	        System.out.println("Hora: " + hora);
	        System.out.println("Lugar: " + lugar);
	        System.out.println("Duración: " + duracion + " horas");   
	        System.out.println("\nCantidad de personas:");
	        System.out.println("Menores de 25 años: " + menores25);
	        System.out.println("Entre 26 y 35 años: " + entre26y35);
	        System.out.println("Mayores de 35 años: " + mayores35);
	        
	        scanner.close();
	    	
	}

		
		
	}


}
