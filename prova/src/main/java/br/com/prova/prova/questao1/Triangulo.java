package br.com.prova.prova.questao1;

public class Triangulo {

	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public boolean trianguloValido() {
		if(!(ladoA > 1 && ladoB > 1 && ladoC > 1))
			return false;
		if (!((ladoA + ladoB) > ladoC) && ((ladoB + ladoC) > ladoA) && ((ladoC + ladoA) > ladoB))
			return false;
		return true;
	}
	public String tipoTriangulo() {
		String saida = "Triangulo";
		if (ladoA == ladoB && ladoA == ladoC) {
			return saida += " equilatero";
		} else if (ladoA == ladoB || ladoA == ladoC) {
			return saida += " isosceles";
		} else {
			return saida += " escaleno";
		}
	}


}
