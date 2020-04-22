
import java.util.*;

/*
 * FASE 2 (2 punts)
●	Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)
●	Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
*/

public class Fase2 {

	public static void main(String[] args) {
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;	//DECLARO LAS SEIS VARIABLES STRING
		
		Scanner entrada = new Scanner(System.in);						//DECLARO OBJETO SCANNER
		
		String [] arrayCiutats = new String[6];							//DECLARO OBJETO ARRAY DE TIPO STRING Y LONGITUD 6
		
		
		System.out.println("introduce la primera ciudad : ");		//MUESTRO TEXTO EN CONSOLA PIDIENDO CIUDAD
		ciutat1=entrada.nextLine();									//RECOJO LO ESCRITO EN CONSOLA Y GUARDO EN STRING
		
		System.out.println("introduce la segunda ciudad : ");		//REPITO EL PROCESO EN LAS OTRAS CINCO CIUDADES
		ciutat2=entrada.nextLine();
		
		System.out.println("introduce la tercera ciudad : ");		// 		""		""
		ciutat3=entrada.nextLine();
		
		System.out.println("introduce la cuarta ciudad : ");		// 		""		""
		ciutat4=entrada.nextLine();
		
		System.out.println("introduce la quinta ciudad : ");		// 		""		""
		ciutat5=entrada.nextLine();
		
		System.out.println("introduce la sexta ciudad : ");		   // 		""		""
		ciutat6=entrada.nextLine();
	
		arrayCiutats[0]=ciutat1;									//RELLENO LAS SEIS POSICIONES DEL ARRAY CON LOS SEIS STRING
		arrayCiutats[1]=ciutat2;	
		arrayCiutats[2]=ciutat3;
		arrayCiutats[3]=ciutat4;
		arrayCiutats[4]=ciutat5;
		arrayCiutats[5]=ciutat6;
		
		Arrays.sort(arrayCiutats);									//ORDENO EL ARRAY CIUTATS AL SER LETRAS LO ORDENARA BIEN EL METODO SORT
	
		for (int i=0; i<arrayCiutats.length; i++) {					//RECORRO EL ARRAY CIUTATS EN UN BUCLE
			System.out.println(arrayCiutats[i]);					//IMPRIMO EN CONSOLA CADA ELEMENTO DEL ARRAY CIUDADES
		}
		
	
	}

}
