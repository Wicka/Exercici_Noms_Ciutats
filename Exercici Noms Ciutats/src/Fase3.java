import java.util.Arrays;
import java.util.Scanner;

/*
 * FASE 3 (3 punts)
●	Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)
●	Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
*/

public class Fase3 {

	public static void main(String[] args) {
			
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;		//DECLARO VARIABLES STRINGS
		
		Scanner entrada = new Scanner(System.in);							//DECLARO OBJETO SCANNER
			
		String [] arrayCiutats = new String[6];								//DECLARO OBJETO ARRAY DONDE GUARDARE LAS CIUDADES INTRODUCIDAS EN LOS STRING
		String [] ArrayCiutatsModificades = new String[6];					//DECLARO ARRAY DONDE GUARDARE LAS CIDUDADES MODIFICADAS
		
		String nueva="";											//DECLARO STRING DONDE GUARDO TEMPORALMENTE LA LETRAS PARA SABER SI ES UN 'a'
			
		System.out.println("introduce la primera ciudad : ");		//MUESTRO EN CONSOLA TEXTO PIDIENDO NOMBRE CIUDAD
		ciutat1=entrada.nextLine();									//GUARDO EN STRING EL TEXTO INTRODUCIDO EN CONSOLA CON EL OBJETO SCANNER
			
		System.out.println("introduce la segunda ciudad : ");		// REPITO LO MISMO EN LAS CINCO CIUDADES RESTANTES
		ciutat2=entrada.nextLine();									//			""			""
			
		System.out.println("introduce la tercera ciudad : ");		//			""			""
		ciutat3=entrada.nextLine();									//			""			""
			
		System.out.println("introduce la cuarta ciudad : ");		//			""			""
		ciutat4=entrada.nextLine();									//			""			""
			
		System.out.println("introduce la quinta ciudad : ");		//			""			""
		ciutat5=entrada.nextLine();									//			""			""
			
		System.out.println("introduce la sexta ciudad : ");			//			""			""
		ciutat6=entrada.nextLine();									//			""			""
		
		arrayCiutats[0]=ciutat1;			//GUARDO EN EL ARRAY CADA UNO DE LOS STRINGS
		arrayCiutats[1]=ciutat2;			//		""			""
		arrayCiutats[2]=ciutat3;			//		""			""	
		arrayCiutats[3]=ciutat4;			//		""			""
		arrayCiutats[4]=ciutat5;			//		""			""
		arrayCiutats[5]=ciutat6;			//		""			""
			
		Arrays.sort(arrayCiutats);			//ORDENO EL ARRAY DONDE GUARDE LOS ARRAYS DE CIUDADES			
			
		for(int i=0; i<arrayCiutats.length; i++) {				//RECORRO EL ARRAY CIUDADES PARA TRATAR CADA UNO DE LOS STRINGS				
			
			nueva=arrayCiutats[i].replace('a', '4');  	//GUARDO LA CIUDAD MODIFICADA DENTRO STRING nueva		
			
			nueva=nueva.replace('A', '4');  			//GUARDO LA CIUDAD MODIFICADA DENTRO STRING nueva	
					
		
			ArrayCiutatsModificades[i]=nueva;		//GUARDO EL STRING CON LA CIUDAD MODIFICA O NO DEPENDIENDO DE SI ENTRO EN EL IF LETRA = 'a'
			
			System.out.print(ArrayCiutatsModificades[i]+" , ");  //MUESTRO EN CONSOLA EL NUEVO STRING MODIFICADO
			
		}

	}
}
