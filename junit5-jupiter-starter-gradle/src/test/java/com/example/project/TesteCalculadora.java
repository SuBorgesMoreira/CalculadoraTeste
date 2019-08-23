package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TesteCalculadora {
	private final Calculator calculator = new Calculator();

    @Test
    void adicao() {
        assertEquals(2, calculator.adicao(1, 1));
        assertEquals(-4, calculator.adicao(-2, -2));
        assertEquals(3.7, calculator.adicao(1.2, 2.5));
    }
    
    @Test
    void subtracao() {
        assertEquals(0, calculator.subtracao(1, 1));
        assertEquals(-5, calculator.subtracao(7, 2));
        assertEquals(2.5, calculator.subtracao(5.0, 2.5));
            }
    
    @Test
    void multiplicacao() {
    	assertEquals(6, calculator.multiplicacao(2, 3));
    	assertEquals(27.3, calculator.multiplicacao(4.2, 6.5));
    	assertEquals(-10, calculator.multiplicacao(-2, 5));
    }
    
    @Test
    void divisao() {
    	assertEquals(2, calculator.divisao(4, 2));
    	assertEquals(11.1, calculator.divisao(22.2, 2));
    	assertEquals(-2, calculator.divisao(10, -5));
    }
}
