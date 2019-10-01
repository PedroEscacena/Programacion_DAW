Proceso cambiar_digito
	
	
	Definir i,posicion Como Entero;
	Definir num_total,nuevo_digito,nuevo_num_total Como Caracter;
	
	nuevo_num_total<-"";
	
	Escribir "Por favor, introduzca un número entero positivo: ";
	leer num_total;
	
	si CONVERTIRANUMERO(num_total)>0 Entonces
		Escribir "Introduzca la posicion dentro del numero";
		leer posicion;
		Escribir "Introduzca el nuevo dígito: ";
		Leer nuevo_digito;
		
	Para i<-0 Hasta Longitud(num_total) Con Paso 1 Hacer
		
		Si i==posicion Entonces
			nuevo_num_total<-nuevo_num_total + nuevo_digito;
		SiNo
			nuevo_num_total<-nuevo_num_total + Subcadena(num_total,i,i);
			
		Fin Si
		
	Fin Para
	
	Escribir "El número resultante es ", nuevo_num_total;
	SiNo
	escribir "NUMERO INCORRECTO"
	FinSi
FinProceso
