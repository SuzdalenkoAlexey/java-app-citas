package com.example.demo.utils;

public class GestorFacturas {
    // 1. atributes
    public CalculatorService calculatorService;
    public String name;

    // 2. constructor
    public GestorFacturas() {}

    public GestorFacturas(CalculatorService calculatorService, String name) {
        System.out.println("ejecutando contstuctor de GestorFacturas");

        this.calculatorService = calculatorService;
        this.name = name;
    }

    // 3. getters and setters
    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    public CalculatorService getCalculatorService() { 
        return this.calculatorService; 
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // 4 methods

}
