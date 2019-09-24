Proceso sin_titulo
	definir num,i Como Entero
	
	escribir "Escriba el numero"
	leer num
	Escribir sin saltar "Los divisores de ",num, " son: "
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num%i=0 Entonces
			Escribir sin saltar i," "
		Fin Si
	Fin Para
FinProceso
