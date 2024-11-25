package uninter;

public class Real extends Moeda {
	
	//guarda o valor inicial adicionado à moeda
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	//traz a informação sobre a moeda de real 
	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass() ) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
	
		return true;
	}
	
}