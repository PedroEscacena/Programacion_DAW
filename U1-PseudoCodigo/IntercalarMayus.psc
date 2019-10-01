Proceso Intercalar_Mayusculas
	Definir nombre,Cambios Como Caracter
	Definir i como entero
	Escribir "Digame un nombre"
	Leer nombre
	cambios<-""
	Para i<-0 Hasta Longitud(nombre) Con Paso 1 Hacer
		Si i%2==0 Entonces
			cambios<-cambios + Mayusculas(  Subcadena(nombre,i,i))
		SiNo
			cambios<-cambios + Subcadena(nombre,i,i)
		Fin Si
	Fin Para
	Escribir cambios
FinProceso
