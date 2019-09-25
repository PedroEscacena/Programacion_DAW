SubProceso resultado <- EsMayor ( numero1,numero2 )
	
	Definir resultado Como Logico
	
	si numero1>numero2 Entonces
		resultado<-verdadero;
	SiNo
		resultado<-Falso;
	FinSi
	
Fin SubProceso




Proceso funcion1
	
Definir n1,n2 Como Entero;
	Escribir "Introduce n1";
	Leer n1;
	Escribir "Introduce n2";
	Leer n2;
	
	Si EsMayor(n1,n2) Entonces
		Escribir "El primero es mayor";
	SiNo
		Escribir "El segundo es mayor";
	FinSi
	
FinProceso

	