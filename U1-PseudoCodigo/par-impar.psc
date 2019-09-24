Proceso sin_titulo
	Definir i,par,impar,num Como Entero
	Escribir "Diga el numero"
	leer num
	par<-0
	impar<-0
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si i%2=0 Entonces
			par<-par+i
		SiNo
			impar<-impar+i
		Fin Si
	Fin Para
	escribir "Par: ",par," Impar: ",impar
FinProceso
