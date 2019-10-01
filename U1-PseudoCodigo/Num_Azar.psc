Proceso Num_Azar
	Definir Num_Aleat,i,num Como Entero
	Num_Aleat<-AZAR(100)+1
	i<-0
	Escribir num_Aleat
	Repetir
		Escribir"¿Cuál es el número al azar?"
		Leer num
		Si Num_Aleat>num Entonces
			Escribir "Te has quedado corto"
		SiNo 
			Si Num_Aleat<num
				Escribir "Te has pasado"
			SiNo
				Escribir"CORRECTO"
			Fin Si
			
		Fin Si
		i<-i+1
	Hasta Que i=7 O num_Aleat= num
	
	Si i=7 Y num_Aleat<> num Entonces
		Escribir "Vuelve a intentarlo"
	Fin Si
	
	
	
FinProceso
