programa
{
	                    // 50kg limite - R$4,00 kg excedente. 
	funcao inicio()
	{
	real Ex, P, M, total
	
		escreva("Qual o peso do tomate?")
		leia (P)
		Ex = P-50
		M = 4
		total = Ex*4
		se (P <= 50)
		escreva ("Peso dentro do limite. \nSua multa é ZERO")
		se (P>50)
		escreva ("Você excedeu o peso. Sua multa será R$", Ex*4)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */