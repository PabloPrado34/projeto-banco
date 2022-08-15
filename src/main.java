
public class main {

	public static void main(String[] args) {
		Cliente pablo = new Cliente();
		pablo.setNome("Pablo");
		
		Cliente nirlei = new Cliente();
		nirlei.setNome("Nirlei");
		
		Conta cc = new ContaCorrente(pablo);
		cc.depositar(1500);
		
		Conta poupanca = new ContaPoupanca(pablo);
		
		cc.transferir(325, poupanca);
		
		Conta cc1 = new ContaCorrente(nirlei);
		cc.transferir(175, cc1);
		
		cc.imprimirExtrato();
		cc1.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
