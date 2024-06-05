package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@SuperBuilder

// Ejercicio 5a
public class Estudiante extends Persona {

	private Facultad facultad;
	private int totalAsignaturasMatriculadas;
	
}
