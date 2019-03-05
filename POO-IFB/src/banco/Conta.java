// JAVA CODE CONVENTION

/*-
 * Comentários de bloco podem começar com / * -, reconhecido pelo travessão (1)
 * como o início de um bloco de comentário que não deve ser reformatado, ou
 * seja é um alerta de que, quem o fez quer que mantenha nessa forma.
 */

/*-
 * Comentários
 *
 * Programas em Java podem ter dois tipos de comentários: comentários de
 * implementação do código e comentários de documentação. Observações de aplicação
 * são os encontrados no mesmo modo C ++, que são delimitados por / * ... * /, e
 * / /. Comentários de documentação (conhecido como "comentários doc") são
 * Java-only, e são delimitados por / ** ... * /. Comentários de documentação
 * podem ser extraídos para arquivos HTML usando a ferramenta javadoc.
 */

/*- 
 * COMENTÁRIOS NO INÍCIO DA CLASSE COM O NOME DA CLASSE, INFORMAÇÃO DE VERSÃO,
 * DATA E HORA, AUTOR E INFORMAÇÕES GERAIS SOBRE O MÉTODO
 */

/*-
 * Um comentário de bloco deve ser precedido por uma linha em branco para
 * separá-la do resto do código.
 */

/**
 * classname				Main
 * 
 * Version Information		1.0
 * 
 * Date						5 de março de 2019								
 * 
 * @author					Marcos Vasconcellos de Andrade
 * 
 * Copyright notice			Classe Conta do projeto SISTEMA BANCÁRIO
 *  
 */

/*-
 * PRIMEIRO O PACOTE E DEPOIS OS IMPORTs, SE HOUVEREM
 * O NOME DO PACOTE É UM COMPONENTE ÚNICO, ESCRITO EM MINÚSCULOS
 */

package banco;

/*-
* Os nomes de classe devem ser substantivos, em maiúsculas e minúsculas com a
* primeira letra de cada palavra interna em maiúscula. Tente manter seus nomes
* de classe simples e descritivo. Sempre evite palavras-ligadas , evite todas
* siglas e abreviaturas, seja semântico.
*/

/**
* Classe Conta do Projeto SISTEMA BANCÁRIO
* 
* destinada ao controle de contas bancarias
*
*/

public class Conta extends Cliente{
	
	/*
	 * Os nomes de variáveis não deve começar com underscore _ ou sinal de dólar $
	 * personagens, mesmo que ambos sejam permitidos. Os nomes de variáveis devem
	 * ser curtos, mas significativo. A escolha de um nome variável deve ser
	 * mnemônico, isto é, concebidos para indicar ao observador casual a intenção da
	 * sua utilização.
	 */
	
	// Atributos - Variáveis
	private double saldo;
	private String numero;
	private String tipo;
	private boolean ativa;
	private double limite;
	
	// construtor
	
	public Conta(String numero, String tipo, double limite){
	this.saldo = 0.0;
	this.numero = numero;
	this.tipo = tipo;
	this.ativa = true;
	this.limite = limite;
			
	}
	
	/*
	 * Métodos devem ser verbos, com a letra minúscula em primeiro lugar, com a
	 * primeira letra de cada palavra interna em maiúscula.
	 */
	
	// Métodos - Funções
	public double obterSaldo(){
		return saldo;
	}
	
	public void sacar(double valor){
		if (verificarSaldo(valor)) {
			saldo = saldo - valor;
		}else {
			System.err.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor){
		if(valor <= 0) {
			return;
		}		
		saldo = saldo + valor;
	}
	
	public void transferir(double valor, Conta outraConta) {
		if (verificarSaldo(valor)) {
			saldo = saldo - valor;
			outraConta.depositar(valor);
		}else {
			System.err.println("Saldo insuficiente");
		}
	}
	
	public boolean verificarSaldo(double valor) {
		if(valor <= 0) {
			return false;
		}
		if (valor > saldo + limite) {
			return false;
		}
		return true;
	}
	
	public void mudarlimite(double novolimite) {
		limite = novolimite;
		
	}
		
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", tipo=" + tipo + ", ativa=" + ativa + ", limite="
				+ limite + "]";
	}
		
	
}