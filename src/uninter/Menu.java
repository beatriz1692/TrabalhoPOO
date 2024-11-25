package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	//menu principal com as opções a serem escolhidas 
	public void exibirMenuPrincipal() {
		System.out.println("COFRINHO:");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular valor total convertido para real");
		System.out.println("0 - Encerrar");
		
		//verifica o dado inserido
		String opcaoSelecionada =  sc.next();
		
		//caso seja selecionada a opção 0
		switch (opcaoSelecionada) {
			case "0":
				System.out.println("Sistema finalizado!");
				break;
				
		//caso seja selecionada a opção 1 para adicionar uma moeda no cofrinho
			case "1":
				exibirSubMenuAdicionarMoedas();
				exibirMenuPrincipal();
				break;
				
		//caso seja selecionada a opção 2 para remover uma moeda adicionada anteriormente no cofrinho
			case "2":
				exibirSubMenuRemoverMoedas();
				exibirMenuPrincipal();
				break;
				
		//caso seja selecionada a opção 3 para listar as moedas adicionadas e presentes no cofrinho
			case "3":
				cofrinho.listagemMoedas();
				exibirMenuPrincipal();
				break;
				
		//caso seja selecionada a opção 4 para saber o valor total convertido para real que há no cofrinho
			case "4":
				double valorTotalConvertido = cofrinho.totalConvertido();
				String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
				valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace("," , ".");
				System.out.println("O valor total convertido para real ? " + valorTotalConvertidoTextual);
				exibirMenuPrincipal();
				break;
				
			//caso seja selecionada outra opção não listada no menu principal
			default:
				System.out.println("Opção inválida!");
				break;
		}
		
	}
	//submenu da opção 1 para adicionar moedas no cofrinho, após adicionar a moeda é retornado o menu principal
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolha moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro"); 
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		String valorTextualMoeda = sc.next();
		//método utilizado para transformar números escritos com uma "," ao invés de um "."
		valorTextualMoeda = valorTextualMoeda.replace("," , ".");
		double valorMoeda = Double.parseDouble(valorTextualMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");
		
	}
	//caso seja selecionado para remover alguma moeda previamente adicionada, após remover é voltado ao menu principal
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Escolha moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro"); 
		
		int opcaoMoeda = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		//método utilizado para converter os números adicionados com , para com .
		String valorTextualMoeda = sc.next();
		valorTextualMoeda = valorTextualMoeda.replace("," , ".");
		double valorMoeda = Double.parseDouble(valorTextualMoeda);
		//valor inicial null
		Moeda moeda = null;
		
		if (opcaoMoeda == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoeda == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Não existe essa moeda!");
			exibirMenuPrincipal();
		}
		
		
		cofrinho.remover(moeda);
		
	}
	
	
}
