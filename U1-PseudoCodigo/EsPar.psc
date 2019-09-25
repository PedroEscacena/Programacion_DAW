SubProceso resultado <- EsPar ( numero1 )

Definir resultado Como Logico

si numero1%2=0 Entonces
	resultado<-verdadero;
SiNo
	resultado<-Falso;
FinSi

Fin SubProceso




Proceso pares
	
	Definir n1 Como Entero;
	Escribir "Introduce n1";
	Leer n1;

	Si EsPar(n1) Entonces
		Escribir "Es par";
	SiNo
		Escribir "No es par";
	FinSi
	
FinProceso