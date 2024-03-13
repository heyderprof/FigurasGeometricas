package Entidades;

public class Aplicacao {

	public static void main(String[] args) { //método que indica o início da execução em java
		
		System.out.println("Criando figuras:");
		Figura A = new Retangulo("retangulo", "azul", 100, 80);
		Figura B = new Triangulo("triangulo", "verde", 100, 80);
		Figura C = new Quadrado("quadrado", "preto", 100);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

	}

}
