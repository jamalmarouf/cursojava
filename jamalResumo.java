
class MeuPrograma { 	//É obrigatorio criar uma class
    public static void main(String[] args) {
		
		/*miolo do programa começa aqui*/
		
		int valorSomar = 0; // variável do tipo inteiro, podemos declarar variáveis a qualquer momento. Porém, dependendo de onde você as declarou, ela vai valer de um determinado ponto a outro, dentro dá quele bloco {}
		int valorZero = 0; // variavel do tipo inteiro
		int idade = 10; //declarção de variável, tipo, nome e valor
		int incremento1 = 1; 
		int incremento2 = 1;
		int incrementoTipo1 = incremento1++; //O operador ++, quando vem após a variável, retorna o valor antigo
		int incrementoTipo2 = ++incremento2;
		
		System.out.println("Minha primeira Linha em Java! \nMinha Segunda linha em Java!"); //Para mostrar uma linha, texto para leitura em ""
		
		System.out.println("Mostrando valor da variavel idade: "+idade); //Para mostrar um texto mais a variável, acrescenta +
		
		for (int i=1;i<=1000;i++){ //comando usado para loop, for: (inicialização, condição, incremento){codigo;}
			
			valorSomar=valorSomar+i;
		}
		System.out.println("for: Valor da soma ="+valorSomar);
		
		while (valorSomar < 1000){ //comando usado para loop, while: (condição) {codigo+incremento}
			valorSomar = valorSomar+1;
		}
		System.out.println("while valor="+valorSomar);
		
		while (valorZero < 10) { //comando usado para loop, while: (condição) {codigo+incremento}
		System.out.println("while: Imprimindo de 0 a 9="+valorZero);    
		valorZero = valorZero + 1;
		}
		
		if (valorZero < valorSomar){ //if e else: if(condiçãoBooleana){codigo;}
			System.out.println("Condicao verdadeira");
		} else {
			System.out.println("Condição falsa");
			
		}
		
		System.out.println(incremento1);
		System.out.println(incremento2);
		System.out.println(incrementoTipo1);
		System.out.println(incrementoTipo2);
		/*fim miolo do programa*/
	}
}