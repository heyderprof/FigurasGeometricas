package Entidades;

public class Retangulo extends Figura {
	
	private double comprimento; // atributos próprios da subclasse
	private double largura;
	
	
	public Retangulo(String tipo, String cor, double comprimento, double largura) {
		super(tipo, cor); // atributos herdados da superclasse
		
		this.comprimento = comprimento;
		this.largura = largura;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	@Override // anotação para indicar sobreposição / sobrecarga
	public double calcularArea() {
		return comprimento * largura;
	}
	
	
	
	
	

}
