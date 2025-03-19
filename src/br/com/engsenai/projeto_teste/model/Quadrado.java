package br.com.engsenai.projeto_teste.model;

public class Quadrado {
	
	private double lado;
	
	// Método para definir o valor do lado
    public void setLado(double lado) {
        this.lado = lado;
    }

    private double calcularArea() {
        return lado * lado;
    }

    private double calcularPerimetro() {
        return 4 * lado;
    }

    public void mostrarDados() {
    	System.out.println("-----------------------------------");
    	System.out.println("Q U A D R A D O");
    	System.out.println("-----------------------------------");
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("-----------------------------------");
    }

    

}
