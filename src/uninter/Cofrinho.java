package uninter;

import java.util.ArrayList;

//trata de todas as moedas e referente a adicionar, remover e converter valores das moedas
public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	
	//lista se há moedas no corfinho ou não e retorna a mensagem correspondente com a situação
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
		
	}
	//pega os valores das moedas adicionadas de euro, dolar para serem convertidas para real e junta o valor com os valores de real adicionados já presentes no cofrinho e mostra na tela
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
		
	}


	
}
