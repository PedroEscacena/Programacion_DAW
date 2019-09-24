Proceso sin_titulo
	Definir x_inic,y_inic,i,aux como entero
	aux<-1
	Escribir "Escriba el valor de x"
	leer x_inic
	Escribir "Escriba el valor de y"
	leer y_inic
	//x^y
	Para i<-1 Hasta y_inic Con Paso 1 Hacer
		aux<-aux*x_inic
	Fin Para
	escribir "El valor de x elevado a y es: ",aux
	aux<-1
	//y^x
	Para i<-1 Hasta x_inic Con Paso 1 Hacer
		aux<-aux*y_inic
	Fin Para
	escribir "El valor de y elevado a x es: ",aux
	
FinProceso
