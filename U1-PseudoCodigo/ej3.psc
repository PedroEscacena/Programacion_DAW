Proceso reloj_arena
	
	Definir altura, i,u Como Entero;
	Escribir "Diga la altura del reloj de arena (debe ser un número impar mayor o igual a 3)";
	Leer altura;
	
	
	Si altura%2!=0 Y altura>=3 Entonces
		
		Para i<-REDON(altura/2) Hasta 2 Con Paso -1 Hacer
			Para u<-i Hasta 1 Con Paso -1 Hacer
				escribir sin saltar "*";
			Fin Para
			escribir "";
		FinPara
		
		escribir "*";
		
		Para i<-2 Hasta REDON(altura/2) Con Paso 1 Hacer
			Para u<-1 Hasta i Con Paso 1 Hacer
				escribir sin saltar "*";
			Fin Para
			escribir "";
		FinPara
		
	SiNo
		Escribir "DATO INTRODUCIDO ERRONEO";
		
	Fin Si
	
FinProceso
