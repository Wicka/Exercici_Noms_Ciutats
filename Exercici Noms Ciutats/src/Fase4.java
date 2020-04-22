
import java.util.*;

/*
 * FASE 4 (3 punts)
●	Creeu un nou array per cada una de les ciutats que tenim. 
    La mida dels nous arrays sera la llargada de cada string 
    ( string nomCiutat.Length). (0,5 punts)
●	Ompliu els nous arrays lletra per lletra.(2 punts)
●	Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
*/
 
public class Fase4 {

	public static void main(String[] args) {

		String  ciutat1="Barcelona", ciutat2="Madrid", ciutat3="Valencia", ciutat4="Malaga", ciutat5="Cadis", ciutat6="Santander";		//DECLARO VARIABLES STRINGS Y LAS INICIALIZO
		
		char [] arrCiutat1 = new char[ciutat1.length()];	//DECLARO LOS ARRAY DE CADA CIUDAD CON LA MISMA LONGITUD
		char [] arrCiutat2 = new char[ciutat2.length()];
		char [] arrCiutat3 = new char[ciutat3.length()];
		char [] arrCiutat4 = new char[ciutat4.length()];
		char [] arrCiutat5 = new char[ciutat5.length()];		
		char [] arrCiutat6 = new char[ciutat6.length()];

		int iCont=0,i,j,numAux;
		
			
		int [] longMax = new int[6];		//DECLARO ARRAY DONDE GUARDO LONGITUDES DE LOS STRING
			
		longMax[0]=ciutat1.length();		//RELLENO ARRAY LONGITUD CON LAS LONGITUDES DE LOS 6 STRING
		longMax[1]=ciutat2.length();
		longMax[2]=ciutat3.length();
		longMax[3]=ciutat4.length();
		longMax[4]=ciutat5.length();
		longMax[5]=ciutat6.length();
		
		
		//AVERIGUO EL STRING MAS LARGO PARA SABER CUANTAS VECES ITERAR EN EL SIGUIENTE BUCLEO
		
		for (i=0; i < longMax.length-1; i++) {			//ITERO POR CADA ELEMENTO
			
			for (j=0; j < longMax.length-1 ; j++) {		//RE-ITERO POR CADA ELEMENTO COMPARANDO CON EL QUE ESTOY DEL FOR MAYOR
				
				if ( longMax[j+1] < longMax[j] ) {		//SI EL SIGUIENTE NUMERO ES MENOR QUE EL DE POSICION [j] ORDENO EL ARRAY DE MENOR A MAYOR
					
					numAux=longMax[j+1];				//INTERCAMBIO EL ELEMENTO DE ORDEN PASANDO AL SIGUIENTE
					longMax[j+1]=longMax[j];
					longMax[j]=numAux;
					
				}
			}						
	
		}
		
		iCont=longMax[longMax.length-1];		//CONSIGO EL VALOR MAS ALTO DEL ARRAY LONGITUDES
		
		for (i=0; i < iCont; i++) {			//BUCLE PARA RELLENAR LETRA A LETRA LOS 6 ARRAYS LO HARA TANTAS VECES COMO EL STRING MAS LARGO 		
											//VERIFICADO ANTERIORMENTE
			
			if(i < arrCiutat1.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat1[i]=ciutat1.charAt(i);
			}
			
			if(i < arrCiutat2.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat2[i]=ciutat2.charAt(i);
			}
			
			if(i < arrCiutat3.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat3[i]=ciutat3.charAt(i);
			}
			
			if(i < arrCiutat4.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat4[i]=ciutat4.charAt(i);
			}
			
			if(i < arrCiutat5.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat5[i]=ciutat5.charAt(i);
			}
			
			if(i < arrCiutat6.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat6[i]=ciutat6.charAt(i);
			}
							
		}
		
		//MOSTRAR LOS ARRAYS INVERTIDOS
		
		ciutat1=ciutat2=ciutat3=ciutat4=ciutat5=ciutat6="";	//LIMPIO STRINGS
		
		for (i=iCont; i >= 0; i--) {			//RECORRO EL CONTADOR DE LA LONGITUD MAX A CERO
			
			if(i < arrCiutat1.length) {			//SI NO SUPERA LONGITUD ENTRO Y 
				ciutat1+=arrCiutat1[i];			//GUARDO LETRA A LETRA EN STRING ciutat1
				}	
			if(i < arrCiutat2.length) {		//SI NO SUPERA LONGITUD ENTRO Y 	
				ciutat2+=arrCiutat2[i];		//GUARDO LETRA A LETRA EN STRING ciutat2
				}				
			if(i < arrCiutat3.length) {		//SI NO SUPERA LONGITUD ENTRO Y 	
				ciutat3+=arrCiutat3[i];		//GUARDO LETRA A LETRA EN STRING ciutat3
			}	
			if(i < arrCiutat4.length) {		//SI NO SUPERA LONGITUD ENTRO Y 	
				ciutat4+=arrCiutat4[i];		//GUARDO LETRA A LETRA EN STRING ciutat4
			}
			if(i < arrCiutat5.length) {		//SI NO SUPERA LONGITUD ENTRO Y 	
				ciutat5+=arrCiutat5[i];		//GUARDO LETRA A LETRA EN STRING ciutat5
			}
			if(i < arrCiutat6.length) {		//SI NO SUPERA LONGITUD ENTRO Y 	
				ciutat6+=arrCiutat6[i];		//GUARDO LETRA A LETRA EN STRING ciutat6
			}
		}
				
		System.out.println(ciutat1);		//MUESTRO EN PANTALLA CADA UNO DE LOS STRINGS INVERTIDOS
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);

	}

}
