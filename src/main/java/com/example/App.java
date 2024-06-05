package com.example;

public class App {

    public static void main( String[] args ) { 
    // Ejercicio 4a
    	
    Empleado[] arrayEmpleados = {
    		
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
    for(Empleado empleado : arrayEmpleados)
    	System.out.println(empleado);
    
    
    
    double sumatoriaDeLosSalarios = 0.0;
    int totalDeEmpleados = arrayEmpleados.length;
    double salarioPromedio = 0.0;
    
    for(Empleado empleado : arrayEmpleados)
    	sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + empleado.getSalario();
    salarioPromedio = sumatoriaDeLosSalarios / totalDeEmpleados;
   
    	System.out.println("El salario promedio de todos los empleados es: " + salarioPromedio);
    	
    double sumatoriaSalariosHombre = 0.0;
    double sumatoriaSalariosMujer = 0.0;
    double sumatoriaSalariosOtro = 0.0;
    
    int totalGeneroHombre = 0;
    int totalGeneroMujer = 0;
    int totalGeneroOtro = 0;
    
    double salarioPromedioHombres = 0.0;
    double salarioPromedioMujeres = 0.0;
    double salarioPromedioOtro = 0.0;
    
    for(Empleado empleado : arrayEmpleados) {
    	if(empleado.getGenero().equals(Genero.HOMBRE)) {
    		sumatoriaSalariosHombre += empleado.getSalario();
    		totalGeneroHombre++;
    	} else if(empleado.getGenero().equals(Genero.MUJER)) {
    		sumatoriaSalariosMujer += empleado.getSalario();
    		totalGeneroMujer++;
    	} else {
    		sumatoriaSalariosOtro += empleado.getSalario();
    		totalGeneroOtro++;
    		}
    	salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
    	salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
    	salarioPromedioOtro = sumatoriaSalariosOtro / totalGeneroOtro;
    	
    } System.out.println("Salario Promedio de los hombres : " + salarioPromedioHombres);
      System.out.println("Salario Promedio de los mujeres : " + salarioPromedioMujeres);
      System.out.println("Salario Promedio de los otros generos : " + salarioPromedioOtro);
      
      Departamento sumatoriaDeDepartamentos;
      
      System.out.println("El salario promedio agrupado por departamento es :");
      
      // Ejercicio 4b
      
      double salarioPromedioRRHH = 0.0;
      double salarioPromedioCONTABILIDAD = 0.0;
      double salarioPromedioINFORMATICA = 0.0;
    
      double sumatoriaSalariosRRHH = 0.0;
      double sumatoriaSalariosCONTABILIDAD = 0.0;
      double sumatoriaSalariosINFORMATICA = 0.0;
      
      int totalRRHH = 0;
      int totalCONTABILIDAD = 0;
      int totalINFORMATICA = 0;
      
      
      for(Empleado empleado : arrayEmpleados) {
      	if(empleado.getDepartamento().equals(Departamento.RRHH)) {
      		sumatoriaSalariosRRHH += empleado.getSalario();
      		totalRRHH++;
      	} else if(empleado.getDepartamento().equals(Departamento.CONTABILIDAD)) {
      		sumatoriaSalariosCONTABILIDAD += empleado.getSalario();
      		totalCONTABILIDAD++;
      	} else {
      		sumatoriaSalariosINFORMATICA += empleado.getSalario();
      		totalINFORMATICA++;
      		
            System.out.println("El salario promedio por departamento RRHH es :");
            System.out.println("El salario promedio por departamento CONTABILIDAD es :");
      	    System.out.println("El salario promedio por departamento INFORMATICA es :");
      		}
      	
      }
    	  
      
    			}
}	
