import java.util.*;

/*
 * FASE 1 (2 punts)
●	Crea sis variables tipu string buides. (0,5 punts)
●	Demana per consola que s’introdueixin els noms. (0,5 punts)
●	Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. (0,5 punts)
●	Mostra per consola el nom de les 6 ciutats. (0,5 punts)
*/


public class Fase1 {

	public static void main(String[] args) {
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;	//DECLARO LOS 6 VARIABLES 
 		Scanner entrada = new Scanner(System.in);						//DECLARO UN NUEVO OBJETO SCANNER PARA RECOGER DATOS CONSOLA
		
		System.out.println("introduce la primera ciudad : ");	//MUESTRO MSJ EN PANTALLA PARA PEDIR LA PRIMERA CIUDAD
		ciutat1=entrada.nextLine();								//GUARDO EN STRING LO QUE INTRODUCEN EN CONSOLA EN EL OBJETO SCANNER
		
		System.out.println("introduce la segunda ciudad : ");	//REPITO LO MISMO PARA LAS CINCO RESTANTES CIUDADES
		ciutat2=entrada.nextLine();								//		""
		
		System.out.println("introduce la tercera ciudad : ");	//		""
		ciutat3=entrada.nextLine();								//		""
		
		System.out.println("introduce la cuarta ciudad : ");	//		""
		ciutat4=entrada.nextLine();								//		""
		
		System.out.println("introduce la quinta ciudad : ");	//		""
		ciutat5=entrada.nextLine();								//		""
		
		System.out.println("introduce la sexta ciudad : ");		//		""
		ciutat6=entrada.nextLine();								//		""
	
		//MUESTRO EN CONSOLA EL NOMBRE DE LAS SEIS CIUDADES
		System.out.println("Les ciutats introduides son : \n" + ciutat1 +" , " + ciutat2 +" , " + ciutat3 +" , " + ciutat4 +" , " + ciutat5 +" , " + ciutat6 );
	}

}
