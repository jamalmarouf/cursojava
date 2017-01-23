class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;
	
	void deposita(double valorASerDepositado){ //void Compotamento (tipoVariavel variavel1) {this.variavelOriginal += variavelNova;}  VOID é acrescentado no comportamento poís so manipula os dados da conta
		this.saldo += valorASerDepositado;  //this mostrar que a variavel é da classe atual da variavel saldo, class Conta {double saldo;}
	}
	
	void saca (double valorASerSacado){ // void comportamento (tipoVariavel Variavel2) {if(this.valorOriginal >= Variavel2){this.valorOriginal -= Variavel2;}}
		if(this.saldo >= valorASerSacado){ //este comportamento demostra uma subtração, se houver saldo na conta 
		this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Programa {
	public static void main(String[] args) {
		
		Conta Bruno = new Conta();
		Bruno.numero = 001;
		Bruno.saldo = 800.000;
		Bruno.titular = "Bruno";
		Bruno.agencia = 181;
		
		Bruno.deposita(100.00); //acessa o comportamento e acrescenta o valor 
		Bruno.saca(100.00);
	
		
		Conta jamal = new Conta();
		jamal.numero = 001;
		jamal.saldo = 100.00;
		jamal.titular = "Jamal";
		jamal.agencia = 11;
		
		jamal.deposita(180.00); //acessa o comportamento e acrescenta o valor 
		jamal.transfere(25.0, Bruno); //acessa o comportamento e transfere valor
		
		System.out.println(jamal.saldo);
		System.out.println(Bruno.saldo);
	}
}