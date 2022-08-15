import javax.swing.JList;

public class banco {
	
	private String nome;
	private JList <Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JList<Conta> getContas() {
		return contas;
	}

	public void setContas(JList<Conta> contas) {
		this.contas = contas;
	}
	
	
}
