SubProceso  EscribirCentrado ( mensaje )
	definir long, contador Como Entero
	long <-Longitud(mensaje)
	Para contador<-1 Hasta (40-long)/2 Con Paso 1 Hacer
		Escribir sin saltar "*"
	Fin Para
	Escribir Sin Saltar mensaje
	Para contador<-1 Hasta (40-long)/2 Con Paso 1 Hacer
		Escribir sin saltar "*"
	Fin Para
Fin SubProceso

Proceso ESCRIB
	EscribirCentrado("Hola")
FinProceso
