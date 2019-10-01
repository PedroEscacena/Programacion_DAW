Proceso sin_titulo
		Definir frase,espacio  Como Caracter
		Definir i,num_palabras como entero
		Escribir "Escriba una frase"
		leer frase
		espacio<-" "
		num_palabras<-0
		
		Para i<-1 Hasta Longitud(frase)-1 Con Paso 1 Hacer
			
			si Subcadena(frase,i,i)<>" " Y espacio==" " entonces
				num_palabras<-num_palabras+1
				espacio<-Subcadena(frase,i-1,i-1)
			FinSi
			
		Fin Para
		
		Escribir "El número de palabras de la frase es: " ,  num_palabras
		
FinProceso
