package uninter;

public class Dolar extends Moeda{


	//guarda o valor inicial adicionado à moeda
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}

	//traz a informação sobre a moeda de dolar
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	//converte o valor adicionado referente á cotação atual da moeda para o Real
	@Override
	public double converter() {
		return this.valor * 5.80;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass() ) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
	
		return true;
	}
	
}
