package com.example;

public class App {

    public static void main( String[] args ) { 
    
    Empleado[] objetos = {
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.INFORMATICA)
    		.nombre("Maria Jose")
    		.primerApellido("Rodriguez")
    		.segundoApellido("Hernandez")
    		.salario(2500.80)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.HOMBRE)
    		.departamento(Departamento.CONTABILIDAD)   		
    		.nombre("Carlos")
    		.primerApellido("Garcia")
    		.segundoApellido("Mata")
    		.salario(3100.50)
    		.build(),
    	Empleado.builder()
    		.genero(Genero.MUJER)
    		.departamento(Departamento.RRHH)    		
    		.nombre("Cristina")
    		.primerApellido("Martinez")
    		.segundoApellido("Soria")
    		.salario(1400)
    		.build()
    		
    };
    System.out.println("Recorriendo el array de objetos empleados--------");
    for(Empleado empleado : objetos)
    	System.out.println(empleado);
    
    double sumatoriaDeLosSalarios = 0.0;
    
   
    				System.out.println();
    			}
}
