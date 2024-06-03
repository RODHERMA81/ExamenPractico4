package com.example;

public class App {

    public static void main( String[] args ) { 
    
    Empleado[] empleados = {
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.INFORMATICA)
    		.nombre("Maria Jose")
    		.build(),
    	Empleado.builder()
    		.genero(Genero.HOMBRE)
    		.departamento(Departamento.CONTABILIDAD)
    		.nombre("Carlos")
    		.build(),
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.RRHH)
    		.nombre("Cristina")
    		.build()
    };
    			
    				System.out.println();
    			}
}
