Proceso EsMayor
	
	Definir mayor,total,i como entero
	Dimension mayor[10]
		Escribir "Escriba el numero 0"
	leer mayor[0]
	total<-mayor[0]
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Escribir "Escriba el numero ",i
		leer mayor[i]
		Si mayor[i]>total Entonces
			total<-mayor[i]
		Fin Si
		
	
	Fin Para
	Escribir "El mayor numero es ", total
FinProceso
