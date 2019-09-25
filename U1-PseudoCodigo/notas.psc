Proceso sin_titulo
	Definir notas,total,i como entero
	total<-0
	Dimension notas[10]
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "Escriba la nota numero ",i
		leer notas[i]
		total<-total+notas[i]
	Fin Para
	Escribir total/10
	
FinProceso
