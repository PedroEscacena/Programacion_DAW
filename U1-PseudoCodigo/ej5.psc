SubProceso resultado <- contiene ( num_buscar,array)
	Definir resultado Como Logico;
	Definir i Como Entero;
	resultado<-Falso;
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Si num_buscar==array[i] Entonces
			resultado<-Verdadero;
		Fin Si
	Fin Para
	
Fin SubProceso

SubProceso resultado <- ocurrencias ( num_buscar,array)
	Definir resultado Como Entero;
	Definir i Como Entero;
	resultado<-0;
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Si num_buscar==array[i] Entonces
			resultado<-resultado+1;
		Fin Si
	Fin Para
Fin SubProceso



Proceso Subprocesos
	Definir i,array,tama�o, num_buscar,num_posicion Como Entero;
	
	dimension array[10];
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "Escriba el numero de la posicion: ",i;
		leer num_posicion;
		array[i]<-num_posicion;
	Fin Para
	Escribir "Escriba el numero a buscar: ";
	leer num_buscar;
	
	si contiene(num_buscar,array)==verdadero Entonces
		Escribir "CONTIENE";
	SiNo
		escribir "NO CONTIENE";
	FinSi
	
	Escribir "Numero de ocurrencias: ", ocurrencias(num_buscar,array);
FinProceso
