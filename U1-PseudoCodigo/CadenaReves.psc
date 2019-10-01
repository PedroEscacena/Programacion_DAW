Proceso EJERC_CADENA1
	Definir nombre,reves Como Caracter
	Definir i como entero
	Escribir "Digame un nombre"
	Leer  nombre
	reves<-""
	Para i<-Longitud(nombre) Hasta 0 Con Paso -1 Hacer
		reves<-reves + Subcadena(nombre,i,i)
	Fin Para
	Escribir reves
FinProceso
