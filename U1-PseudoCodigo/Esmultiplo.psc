SubProceso  resultado<-EsMultiplo ( num1, num2 )
	Definir resultado Como Logico
	
	si num1%num2=0 O num2%num1=0
		resultado<-Verdadero
	SiNo
		resultado<-Falso
	FinSi
Fin SubProceso

Proceso multipl
	
	Definir n1,n2 Como Entero;
	Escribir "Introduce n1";
	Leer n1;
	Escribir "Introduce n2";
	Leer n2;
	
	Si EsMultiplo(n1,n2) Entonces
		Escribir "son multiplos";
	SiNo
		Escribir "No son multiplos";
	FinSi
FinProceso
