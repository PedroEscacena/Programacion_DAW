Proceso Contador_Palabras
	Definir frase,espacio  Como Caracter
	Definir i,num_palabras como entero
	Escribir "Escriba una frase"
	leer frase
	espacio<-" "
	num_palabras<-0
	
	si Subcadena(frase,0,0)==" " Entonces
		num_palabras<-num_palabras-2
	FinSi
	Para i<-0 Hasta Longitud(frase) Con Paso 1 Hacer
		Si  Subcadena(frase,i,i)== " " y Subcadena(frase,i-1,i)<> "  "  Entonces
			num_palabras<-num_palabras+1
		Fin Si
		
	Fin Para
	
	Escribir espacio
	si num_palabras<>0 Entonces
		
		num_palabras<-num_palabras +1
	FinSi
	
	Escribir "El número de palabras de la frase es: " ,  num_palabras
	
FinProceso
