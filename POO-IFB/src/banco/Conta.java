// JAVA CODE CONVENTION

/*-
 * Coment�rios de bloco podem come�ar com / * -, reconhecido pelo travess�o (1)
 * como o in�cio de um bloco de coment�rio que n�o deve ser reformatado, ou
 * seja � um alerta de que, quem o fez quer que mantenha nessa forma.
 */

/*-
 * Coment�rios
 *
 * Programas em Java podem ter dois tipos de coment�rios: coment�rios de
 * implementa��o do c�digo e coment�rios de documenta��o. Observa��es de aplica��o
 * s�o os encontrados no mesmo modo C ++, que s�o delimitados por / * ... * /, e
 * / /. Coment�rios de documenta��o (conhecido como "coment�rios doc") s�o
 * Java-only, e s�o delimitados por / ** ... * /. Coment�rios de documenta��o
 * podem ser extra�dos para arquivos HTML usando a ferramenta javadoc.
 */

/*- 
 * COMENT�RIOS NO IN�CIO DA CLASSE COM O NOME DA CLASSE, INFORMA��O DE VERS�O,
 * DATA E HORA, AUTOR E INFORMA��ES GERAIS SOBRE O M�TODO
 */

/*-
 * Um coment�rio de bloco deve ser precedido por uma linha em branco para
 * separ�-la do resto do c�digo.
 */

/**
 * classname				Main2
 * 
 * Version Information		1.0
 * 
 * Date						5 de mar�o de 2019								
 * 
 * @author					Marcos Vasconcellos de Andrade
 * 
 * Copyright notice			Classe Conta2 do projeto SISTEMA BANC�RIO
 *  
 */

/*-
 * PRIMEIRO O PACOTE E DEPOIS OS IMPORTs, SE HOUVEREM
 * O NOME DO PACOTE � UM COMPONENTE �NICO, ESCRITO EM MIN�SCULOS
 */

package banco;

/*-
* Os nomes de classe devem ser substantivos, em mai�sculas e min�sculas com a
* primeira letra de cada palavra interna em mai�scula. Tente manter seus nomes
* de classe simples e descritivo. Sempre evite palavras-ligadas , evite todas
* siglas e abreviaturas, seja sem�ntico.
*/

/**
* Classe Conta2 do Projeto SISTEMA BANC�RIO
* 
* destinada ao controle de contas bancarias
*
*/

public class Conta extends Cliente{
	
	/*
	 * Os nomes de vari�veis n�o deve come�ar com underscore _ ou sinal de d�lar $
	 * personagens, mesmo que ambos sejam permitidos. Os nomes de vari�veis devem
	 * ser curtos, mas significativo. A escolha de um nome vari�vel deve ser
	 * mnem�nico, isto �, concebidos para indicar ao observador casual a inten��o da
	 * sua utiliza��o.
	 */
	
	// Atributos - Vari�veis
	private double saldo;
	private String numero;
	private String tipo;
	private boolean ativa;
	private double limite;
	
	//construtor super
		public Conta() {
			super();
		}
	
	// construtor
	
	public Conta(String numero, String tipo, double limite){
	this.saldo = 0.0;
	this.numero = numero;
	this.tipo = tipo;
	this.ativa = true;
	this.limite = limite;
			
	}
	
	/*
	 * M�todos devem ser verbos, com a letra min�scula em primeiro lugar, com a
	 * primeira letra de cada palavra interna em mai�scula.
	 */
	
	// M�todos - Fun��es
	@Override
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
		return "Conta2 [saldo=" + saldo + ", numero=" + numero + ", tipo=" + tipo + ", ativa=" + ativa + ", limite="
				+ limite + "]";
	}
		
	
}