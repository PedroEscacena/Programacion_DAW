SubProceso EscribirCentrado ( text )
	
	definir i como caracter;
	
	
	Para i<-1 Hasta 40-(Longitud(text)/2) Con Paso 1 Hacer
		
		Escribir Sin Saltar" "
	Fin Para
	Escribir Sin Saltar (text)
	Para i<-1 Hasta 40-(Longitud(text)/2) Con Paso 1 Hacer
		
		Escribir Sin Saltar" "
	Fin Para
Fin SubProceso






Proceso CENTRAR
	
	
Escribir EscribirCentrado("HOLA MUNDO");
	
	
FinProceso
