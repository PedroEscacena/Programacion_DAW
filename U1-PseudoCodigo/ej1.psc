Proceso Horas_Semanales
	Definir num_horas,i,dinero_obtenido Como Entero;
	
	dinero_obtenido<-0;
	
	Escribir "Introduzca el número de horas trabajadas durante la semana: ";
	Leer num_horas;
	
	Para i<-1 Hasta num_horas Con Paso 1 Hacer
		Si i<=40 Entonces
			dinero_obtenido<-dinero_obtenido+10;
		SiNo
			dinero_obtenido<-dinero_obtenido+15;
		Fin Si
	Fin Para
	Escribir "El sueldo semanal que le corresponde es de ", dinero_obtenido;
FinProceso
