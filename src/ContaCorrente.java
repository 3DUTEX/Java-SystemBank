
public class ContaCorrente {
	//atributos: características
	public String nomeTitular;
	private double saldo;
	private String operacoes;
	
	//construtor: espécie de método que é executado qnd um objeto
	//é instanciado. Mesmo nome da classe e não tem retorno.
	public ContaCorrente(String nomeTitular) {
		this.nomeTitular = nomeTitular;
		operacoes = "Extrato de " + this.nomeTitular + "\n";
	}
	
	//métodos: ações
	public void depositar(double valor) {
		this.saldo += valor;
		operacoes += "Depósito: " + valor + "\n";

	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			operacoes += "Saque: " + valor + "\n";
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, ContaCorrente contaDestino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			operacoes += "Transf. realizada: " + valor + "\n";
			contaDestino.operacoes += "Transf. recebida: " + valor + "\n";

			return true;
		}
		return false;
	}
	public String extrato() {
		
		return operacoes + "Saldo final: " + this.saldo;
		
	}

}
