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
 * classname				Main
 * 
 * Version Information		1.0
 * 
 * Date						5 de mar�o de 2019								
 * 
 * @author					Marcos Vasconcellos de Andrade
 * 
 * Copyright notice			Classe Cliente do projeto SISTEMA BANC�RIO
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
* Classe Cliente do Projeto SISTEMA BANC�RIO
* 
* destinada ao controle de clientes do banco
*
*/

public class Cliente {
	
	/*
	 * Os nomes de vari�veis n�o deve come�ar com underscore _ ou sinal de d�lar $
	 * personagens, mesmo que ambos sejam permitidos. Os nomes de vari�veis devem
	 * ser curtos, mas significativo. A escolha de um nome vari�vel deve ser
	 * mnem�nico, isto �, concebidos para indicar ao observador casual a inten��o da
	 * sua utiliza��o.
	 */
	
	//Atributos
	private String nome;
	private String cpf;
	private Conta conta;
	private Agencia agencia;
	private String endereco;
	
	//construtor super
	public Cliente() {
		super();
	}
	
	//construtor
	public Cliente(String nome, String cpf, String endereco){
	this.nome = nome;
	this.cpf = cpf;
	this.endereco = endereco;
	}
		
	/*
	 * M�todos devem ser verbos, com a letra min�scula em primeiro lugar, com a
	 * primeira letra de cada palavra interna em mai�scula.
	 */
	
	//M�todos
	public void atribuirConta(Conta c){
		conta = c;
	}
	
	public void atribuirAgencia(Agencia ag){
		agencia = ag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", conta=" + conta + ", endereco=" + endereco + "]";
	}

	public void sacar(double valor) {
		conta.sacar(valor);
	}

	public void depositar(double valor) {
		conta.depositar(valor);
	}

	public void transferir(double valor, Conta outraConta) {
		conta.transferir(valor, outraConta);
	}

	public boolean verificarSaldo(double valor) {
		return conta.verificarSaldo(valor);
	}

	public void mudarlimite(double novolimite) {
		conta.mudarlimite(novolimite);
	}

	public double obterSaldo() {
		return conta.obterSaldo();
	}

	public void transferirCliente(Agencia agDestino) {
		agencia.transferirCliente(agDestino);
	}
	
	

}
