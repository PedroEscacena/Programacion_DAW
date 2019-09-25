Proceso EsMenor
	
	Definir menor,total,i como entero
	Dimension menor[10]
	Escribir "Escriba el numero 0"
	leer menor[0]
	total<-menor[0]
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Escribir "Escriba el numero ",i
		leer menor[i]
		Si menor[i]<total Entonces
			total<-menor[i]
		Fin Si
		
		
	Fin Para
	Escribir "El menor numero es ", total
	
FinProceso
