Proceso resaltar_multiplo
	Definir array,i,eleccion Como Entero;
	
	Dimension array[20];
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		array[i]<-Aleatorio(1,400);
		Escribir Sin Saltar array[i]," ";
	Fin Para
	
	
	Escribir "";
	Escribir "¿Qué números quiere resaltar? (1- los múltiplos de 5, 2- los múltiplos de 7): ";
	Leer eleccion;
	
	Si eleccion==1 Entonces
		
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			Si array[i]%5==0 Entonces
				Escribir Sin Saltar " ","[",array[i],"]"," ";
			SiNo
				Escribir Sin Saltar " ",array[i]," ";
			Fin Si
		Fin Para
		
	SiNo
		si eleccion==2 entonces
			
			Para i<-0 Hasta 19 Con Paso 1 Hacer
				Si array[i]%7==0 Entonces
					Escribir Sin Saltar " ","[",array[i],"]"," ";
				SiNo
					Escribir Sin Saltar " ",array[i]," ";
				Fin Si
			Fin Para
			
			
		SiNo
			
			Escribir "ERROR: NUMERO NO ES NI 5 NI 7";
			
		FinSi
	Fin Si
	
FinProceso
