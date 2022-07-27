

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta() {
		System.out.println();
	}

	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	
	// metodo retornar uma v�riavel do tipo Boolean
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -=  valor;
			return true;	
	}else { 
		return false;
	}

	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}
			return false;
		}
		
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int Numero) {
		if( numero <= 0) {
			System.out.println("N�o pode menor ou igual a zero ");
		}
		this.numero = Numero;
	}
	public int getAgencia() {
			return this.agencia;	
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode monor ou < = 0 ");
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	
}

