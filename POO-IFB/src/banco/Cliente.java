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
 * Copyright notice			Classe Cliente do projeto SISTEMA BANCÁRIO
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
* Classe Cliente do Projeto SISTEMA BANCÁRIO
* 
* destinada ao controle de clientes do banco
*
*/

public class Cliente extends Banco {
	
	/*
	 * Os nomes de variáveis não deve começar com underscore _ ou sinal de dólar $
	 * personagens, mesmo que ambos sejam permitidos. Os nomes de variáveis devem
	 * ser curtos, mas significativo. A escolha de um nome variável deve ser
	 * mnemônico, isto é, concebidos para indicar ao observador casual a intenção da
	 * sua utilização.
	 */
	
	//Atributos
	private String nome;
	private String cpf;
	private Conta conta;
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
	 * Métodos devem ser verbos, com a letra minúscula em primeiro lugar, com a
	 * primeira letra de cada palavra interna em maiúscula.
	 */
	
	//Métodos
	public void atribuirConta(Conta c){
		conta = c;
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

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", conta=" + conta + ", endereco=" + endereco + "]";
	}

}
