package com.example;

public class App {

    public static void main( String[] args ) { 
   
      
      // Ejercicio 6a
      Object[] empleadosYEstudiantes = {
    		  Empleado.builder()
    		  	.departamento(Departamento.RRHH)
    		  	.salario(1400)
    		  	.build(),
    		  Empleado.builder()
    		  	.departamento(Departamento.CONTABILIDAD)
    		  	.salario(3100.50)
    		  	.build(),
    		  Estudiante.builder()
    		  	.facultad(Facultad.MEDICINA)
    		  	.totalAsignaturasMatriculadas(2)
    		  	.build(),
    		  Estudiante.builder()
    		  	.facultad(Facultad.CIENCIAS)
    		  	.totalAsignaturasMatriculadas(1)
    		  	.build()
      };
  
      }
    	
}
    