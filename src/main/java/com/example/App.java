package com.example;

public class App {

    public static void main( String[] args ) { 
    
    Empleado[] objetos = {
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.INFORMATICA)
    		.nombre("Maria Jose")
    		.primerApellido("Rodriguez")
    		.salario(2500.80)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.HOMBRE)
    		.departamento(Departamento.CONTABILIDAD)
    		.nombre("Carlos")
    		.primerApellido("Garcia")
    		.salario(3100.50)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.RRHH)
    		.nombre("Cristina")
    		.primerApellido("Martinez")
    		.salario(1400)
    		.build()
    		
    };
    
    
    double sumatoriaDeLosSalarios = 0.0;
    
   
    				System.out.println();
    			}
}
