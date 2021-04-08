package PorgramacaoOrientadaObjeto;
public class clienteBTeste {
	
	public static void main(String[] args) {
		
		clienteB [] pessoa = new clienteB [3];
		pessoa [0] = new clienteB ("Jão ", "9999-9999", "bronze");
		pessoa [1] = new clienteB ("José ", "8888-9999", "prata");
		pessoa [2] = new clienteB ("Jessé ", "9999-7777", "diamante");
		for (clienteB loop:pessoa) {
			loop.imprimirInfor();
			System.out.println();
		}

	}

}
