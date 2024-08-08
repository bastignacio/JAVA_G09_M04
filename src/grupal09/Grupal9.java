package grupal09;

import java.util.Scanner;


public class Grupal9 {

	 public static void main(String[] args) {
		 
	 Scanner scanner = new Scanner(System.in);
	
	 	 
	 System.out.print("---- Información de la empresa ----\n\n");
	 	
	 int contador;
	 contador = 0;
	 
	 String rutEmpresa = null, 
			 nombreEmpresa = null, 
			 direccionEmpresa = null, 
			 comunaEmpresa = null, 
			 numeroEmpresa = null, 
			 nombreCapacitacion = null, 
			 fechaCapacitacion = null, 
			 horaCapacitacion = null, 
			 lugarCapacitacion = null, 
			 duracionCapacitacion = null;
	 
	while (contador < 1 ) { 
	 
		 System.out.print("Ingrese RUT cliente (Formato: 12345678-0): ");
		 	rutEmpresa = scanner.nextLine();
		 	
		if (rutEmpresa.length() < 1 || rutEmpresa.length() > 10) {
			System.out.println("Ingrese un RUT válido por favor. \n");
		} else {
			contador++;
		}
	 }
	
	contador = 0;
	while (contador < 1 ) { 
		 
		 System.out.print("Ingrese Nombre cliente: ");
		 	nombreEmpresa = scanner.nextLine();
		 	
		if (nombreEmpresa.length() < 1) {
			System.out.println("Ingrese un Nombre válido por favor. \n");
		} else {
			contador++;
		}
	 }
	 
	contador = 0;
	while (contador < 1 ) { 
		 
		 System.out.print("Ingrese Dirección cliente: ");
		 	direccionEmpresa = scanner.nextLine();
		 	
		if (direccionEmpresa.length() < 1) {
			System.out.println("Ingrese una Dirección válida por favor. \n");
		} else {
			contador++;
		}
	 }
	
	contador = 0;
	while (contador < 1 ) { 
		 
		 System.out.print("Ingrese Comuna cliente: ");
		 	comunaEmpresa = scanner.nextLine();
		 	
		if (comunaEmpresa.length() < 1) {
			System.out.println("Ingrese una Comuna válida por favor. \n");
		} else {
			contador++;
		}
	 }

	contador = 0;
	while (contador < 1 ) { 
		 
		 System.out.print("Ingrese número de teléfono cliente: ");
		 	numeroEmpresa = scanner.nextLine();
		 	
		if (numeroEmpresa.length() < 1) {
			System.out.println("Ingrese una teléfono válido por favor. \n");
		} else {
			contador++;
		}
	 }	
 
	 System.out.print("\n---- Información de la capacitación ----\n");
	 
	contador = 0;
	while (contador < 1 ) { 
		 
		 System.out.print("Ingrese nombre de la capacitación: ");
		 	nombreCapacitacion = scanner.nextLine();
		 	
		if (nombreCapacitacion.length() < 1) {
			System.out.println("Ingrese un nombre válido por favor. \n");
		} else {
			contador++;
		}
	 }		 
	 
       
	contador = 0;
        while (contador < 1) {
        	
            System.out.print("Ingresa la fecha de la capacitación (dd/MM/yyyy): ");
            fechaCapacitacion = scanner.nextLine();
            
            if(fechaCapacitacion.length() < 1) {
            	System.out.println("Ingrese una fecha válida por favor. \n");
            } else {
            	contador++;
            }
        }
           
            
	contador = 0;
	while(contador < 1) {
		System.out.print("Ingrese la hora de la capacitación (hh:mm): ");
		horaCapacitacion = scanner.nextLine();
		
		if(horaCapacitacion.length() < 1) {
			System.out.println("Ingrese una hora válida por favor. \n");
		} else {
			contador++;
		}
	}
        
	 	
	 	
	contador = 0;
	while (contador < 1 ) { 
		 
	 	 System.out.print("Ingrese el lugar de la capacitación: ");
		 	lugarCapacitacion = scanner.nextLine();
		 	
		if (lugarCapacitacion.length() < 1) {
			System.out.println("Ingrese un lugar válido por favor. \n");
		} else {
			contador++;
		}
	 }	

	 
	contador = 0;
	while (contador < 1) {
		
		System.out.print("Ingrese la duración de la capacitación (hh:mm): ");
 	  	duracionCapacitacion = scanner.nextLine();
 	  	
 	  	if(duracionCapacitacion.length() < 1) {
 	  		System.out.println("Ingrese una duración válida por favor. \n");
 	  	}else {
 	  		contador++;
 	  	}
	}
	
	
	int cantidadAsistentes = 0;
	
	contador = 0;
	while (contador < 1 ) { 
		 
	 	 System.out.print("Ingrese la cantidad de asistentes a la capacitación: ");
		 	cantidadAsistentes = scanner.nextInt();
		 	scanner.nextLine();
		 	
		if (cantidadAsistentes < 1) {
			System.out.println("Ingrese una cantidad válida por favor. \n");
		} else {
			contador++;
		}
	 }		 	
	 
	
	System.out.print("\n---- Información de los asistentes ----\n");
	
	int i=0;
	
	String[] nombre = new String[cantidadAsistentes];
	Integer[] edad = new Integer[cantidadAsistentes];
	
	for (i=0;i < cantidadAsistentes;i++) {
		
			System.out.println("Ingrese el nombre: ");
			nombre[i] = scanner.nextLine();
			
			System.out.println("Ingrese la edad: ");
			edad[i] = scanner.nextInt();
			scanner.nextLine();
					
	}
	 
	int menores = 0;
	int intermedios = 0;
	int mayores = 0;


	for(i=0; i < cantidadAsistentes; i++) {

		if(edad[i] <= 25) {
			
			menores++;
			
		} else if (edad[i] > 25 && edad[i] <= 35 ){
			
			intermedios++;
		} else {
			
			mayores++;
			
		}
		
		
	}
	
	scanner.close(); 
	System.out.println("\n---- Información de la empresa ----\n");
	System.out.println("Rut Empresa: " + rutEmpresa);
	System.out.println("El nombre de la empresa es: " + nombreEmpresa);
	System.out.println("La dirección de la empresa es: " + direccionEmpresa + " y se ubica en la comuna de: " + comunaEmpresa);
	System.out.println("El número telefónico de la empresa es: " + numeroEmpresa);
	System.out.println("\n---- Información de la capacitación ----\n");
	System.out.println("El nombre de la capacitación es: " + nombreCapacitacion);
	System.out.println("La capacitación se realizará la fecha: " + fechaCapacitacion);
	System.out.println("La capacitación iniciará a las:  " + horaCapacitacion);
	System.out.println("La capacitación se realizará en: " + lugarCapacitacion);
	System.out.println("La capacitación tendrá una duración de: " + duracionCapacitacion);
	System.out.println("Hay " + cantidadAsistentes + " registrados para la capacitación");
	System.out.println("Cantidad de personas menores a 25 años: " + menores);
	System.out.println("Cantidad de personas entre a 26 y 35 años: " + intermedios);
	System.out.println("Cantidad de personas mayores a 36: " + mayores);
	
	
	 }	 
}
	 