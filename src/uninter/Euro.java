package uninter;

public class Euro extends Moeda {


	//guarda o valor inicial adicionado à moeda
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}

	//traz a informação sobre a moeda de euro
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	//converte o valor adicionado referente á cotação atual da moeda para o Real
	@Override
	public double converter() {
		return this.valor*6.06;
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass() ) {
			return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
	
		return true;
	}
	
	
}
