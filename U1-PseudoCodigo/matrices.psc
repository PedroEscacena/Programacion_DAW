Proceso Matrices
	Definir matriz,x1,y1,i,j,total_linea,prueba como entero
	Escribir "Defina el tamaño de X"
	x1<-4
	Escribir "Defina el tamaño de Y"
	y1<-3
	Dimension notas[x1,y1]
	total_linea<-0
	prueba<-0
	Para i<-1 Hasta x1 Con Paso 1 Hacer
		Para j<-1 Hasta y1 Con Paso 1 Hacer
			Escribir "Valor de posicion ",i,",",j
			leer prueba
			total_linea<-total_linea+prueba
		Fin Para
		Escribir "Sumatoria: ",total_linea
		total_linea<-0
		
	Fin Para
	
	Para fila<-1 Hasta valor_final Con Paso 4 Hacer
		
		suma<-0
		Para columna<-1 Hasta valor_final Con Paso 3 Hacer
			suma<- suma+matriz[fila,columna]
		Fin Para
	Fin Para
	
FinProceso
