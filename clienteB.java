package PorgramacaoOrientadaObjeto;

public class clienteB {
	private String nomeDoCliente;
	private String telDoCliente;
	private String nivelCliente;
	
	public clienteB (String nomeDoCliente, String telDoCliente, String nivelCliente) {
		this.nomeDoCliente = nomeDoCliente;
		this.telDoCliente = telDoCliente;
		this.nivelCliente = nivelCliente;	
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public String getTelDoCliente() {
		return telDoCliente;
	}

	public void setTelDoCliente(String telDoCliente) {
		this.telDoCliente = telDoCliente;
	}

	public String getNivelCliente() {
		return nivelCliente;
	}

	public void setNivelCliente(String nivelCliente) {
		this.nivelCliente = nivelCliente;
	}
	public void imprimirInfor () {
		System.out.println(nomeDoCliente+ "possui o telefone" + telDoCliente + " e possui nesta loja o nível: "+nivelCliente);
	}

}
