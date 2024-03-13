package Entidades;

public class Quadrado extends Figura {
	
	private double lado;

	public Quadrado(String tipo, String cor, double lado) {
		super(tipo, cor);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	
	
	



}
