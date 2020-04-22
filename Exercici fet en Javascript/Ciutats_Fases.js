
/*
 * FASE 1 (2 punts)
●	Crea sis variables tipu string buides. (0,5 punts)
●	Demana per consola que s’introdueixin els noms. (0,5 punts)
●	Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. (0,5 punts)
●	Mostra per consola el nom de les 6 ciutats. (0,5 punts)
*/


function Fase1() {

        var ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;	//DECLARO LOS 6 VARIABLES 
     
        document.getElementById("resultado").innerHTML="";
       
        ciutat1=prompt("Introduce la primera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat1
        ciutat2=prompt("Introduce la segunda ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat2
        ciutat3=prompt("Introduce la tercera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat3
        ciutat4=prompt("Introduce la cuarta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat4
        ciutat5=prompt("Introduce la quinta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat5
        ciutat6=prompt("Introduce la sexta ciudad : ");         //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat6

        document.getElementById("resultado").innerHTML+="Les ciutats introduides son : " +"<br><br>"+ ciutat1 +" , " + ciutat2 +" , " + ciutat3 +" , " + ciutat4 +" , " + ciutat5 +" , " + ciutat6;
}


/*
 * FASE 2 (2 punts)
●	Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). (1 punt)
●	Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic. (1 punt)
*/

function Fase2() {   
    	
		var ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;	//DECLARO LAS SEIS VARIABLES STRING
     
        ciutat1=prompt("Introduce la primera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat1
        ciutat2=prompt("Introduce la segunda ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat2
        ciutat3=prompt("Introduce la tercera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat3
        ciutat4=prompt("Introduce la cuarta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat4
        ciutat5=prompt("Introduce la quinta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat5
        ciutat6=prompt("Introduce la sexta ciudad : ");         //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat6

        var arrayCiutats= [];	 
		
		arrayCiutats[0]=ciutat1;									//RELLENO LAS SEIS POSICIONES DEL ARRAY CON LOS SEIS STRING
		arrayCiutats[1]=ciutat2;	
		arrayCiutats[2]=ciutat3;
		arrayCiutats[3]=ciutat4;
		arrayCiutats[4]=ciutat5;
		arrayCiutats[5]=ciutat6;
            
        document.getElementById("resultado").innerHTML+=
        "Les ciutats introduides son : " +
        "<br><br>"+ arrayCiutats.sort();            
}		



/*
 * FASE 3 (3 punts)
●	Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts)
●	Mostreu per consola l’array modificat i ordenat per ordre alfabetic. (1 punt)
*/

function Fase3() {
var ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;		//DECLARO VARIABLES STRINGS
    
    ciutat1=prompt("Introduce la primera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat1
    ciutat2=prompt("Introduce la segunda ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat2
    ciutat3=prompt("Introduce la tercera ciudad : ");       //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat3
    ciutat4=prompt("Introduce la cuarta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat4
    ciutat5=prompt("Introduce la quinta ciudad : ");        //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat5
    ciutat6=prompt("Introduce la sexta ciudad : ");         //GUARDO EN STRING LO QUE INTRODUCEN EN EL PROMP EN VAR ciutat6
    
    var arrayCiutats= [6];
	var ArrayCiutatsModificades=[6];
    
    var nueva="";
    
    arrayCiutats[0]=ciutat1;									//RELLENO LAS SEIS POSICIONES DEL ARRAY CON LOS SEIS STRING
    arrayCiutats[1]=ciutat2;	
    arrayCiutats[2]=ciutat3;
    arrayCiutats[3]=ciutat4;
    arrayCiutats[4]=ciutat5;
    arrayCiutats[5]=ciutat6;
    
    arrayCiutats.sort();
    document.getElementById("resultado").innerHTML="";
      
    for(let i=0; i<arrayCiutats.length; i++) {				//RECORRO EL ARRAY CIUDADES PARA TRATAR CADA UNO DE LOS STRINGS				
			
        nueva=arrayCiutats[i].replace('a', '4');  	//GUARDO LA CIUDAD MODIFICADA DENTRO STRING nueva		
        
        nueva=nueva.replace('A', '4');  			//GUARDO LA CIUDAD MODIFICADA DENTRO STRING nueva	
                
    
        ArrayCiutatsModificades[i]=nueva;		//GUARDO EL STRING CON LA CIUDAD MODIFICA O NO DEPENDIENDO DE SI ENTRO EN EL IF LETRA = 'a'
        
        document.getElementById("resultado").innerHTML+=ArrayCiutatsModificades[i]+" , "
               
    }     
}


/*
 * FASE 4 (3 punts)
●	Creeu un nou array per cada una de les ciutats que tenim. 
    La mida dels nous arrays sera la llargada de cada string 
    ( string nomCiutat.Length). (0,5 punts)
●	Ompliu els nous arrays lletra per lletra.(2 punts)
●	Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). (0,5 punts)
*/

function Fase4() {   

		var  ciutat1="Barcelona", ciutat2="Madrid", ciutat3="Valencia", ciutat4="Malaga", ciutat5="Cadis", ciutat6="Santander";		//DECLARO VARIABLES STRINGS Y LAS INICIALIZO
        	
		var arrCiutat1 = [ciutat1.length];	//DECLARO LOS ARRAY DE CADA CIUDAD CON LA MISMA LONGITUD
		var arrCiutat2 = [ciutat2.length];
		var arrCiutat3 = [ciutat3.length];
		var arrCiutat4 = [ciutat4.length];
		var arrCiutat5 = [ciutat5.length];		
		var arrCiutat6 = [ciutat6.length];

		var iCont=0,i,j,numAux;		
			
		var longMax = [6];		//DECLARO ARRAY DONDE GUARDO LONGITUDES DE LOS STRING
			
		longMax[0]=ciutat1.length;		//RELLENO ARRAY LONGITUD CON LAS LONGITUDES DE LOS 6 STRING
		longMax[1]=ciutat2.length;
		longMax[2]=ciutat3.length;
		longMax[3]=ciutat4.length;
		longMax[4]=ciutat5.length;
		longMax[5]=ciutat6.length;		
		
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
			
			if(i < ciutat1.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat1[i]=ciutat1.charAt(i);
			}
			
			if(i < ciutat2.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat2[i]=ciutat2.charAt(i);
			}
			
			if(i < ciutat3.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat3[i]=ciutat3.charAt(i);
			}
			
			if(i < ciutat4.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat4[i]=ciutat4.charAt(i);
			}
			
			if(i < ciutat5.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
				arrCiutat5[i]=ciutat5.charAt(i);
			}
			
			if(i < ciutat6.length) {			//SI LA LONGITUD ES MENOR QUE VALOR i NO ENTRARA Y DEJARA DE RELLENAR EL ARRAY
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
				
        document.getElementById("resultado").innerHTML+=            //MUESTRO EN PANTALLA CADA UNO DE LOS STRINGS INVERTIDOS
        "Les ciutats introduides son : " +"<br><br>"+ 
        ciutat1 + "<br>" +  ciutat2 +  "<br>" + 
        ciutat3 + "<br>"  + ciutat4 +"<br>"+
        ciutat5 +"<br>"+ ciutat6;   
}

