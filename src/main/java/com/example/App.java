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
      for(Object object : empleadosYEstudiantes) {
    	  if(object instanceof Empleado) {
    		Empleado empleado = (Empleado) object;
    		
    		System.out.println("El salario del empleado:" + empleado.getSalario());
    	  }else if (object instanceof Estudiante){
    	Estudiante estudiante = (Estudiante) object;
    	
    	System.out.println("La facultad del estudiante es :" + estudiante.getFacultad());
    			}
      }	
    }
}