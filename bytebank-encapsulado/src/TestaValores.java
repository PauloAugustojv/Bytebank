
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		
		// conta est� inconsistente 
		conta.setAgencia(-50);
		conta.setNumero(-50);
		
		System.out.println(conta.getAgencia());
	}

}
