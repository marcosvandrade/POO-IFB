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
 * Copyright notice			Classe Conta do projeto SISTEMA BANC�RIO
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
* Classe Funcionarios do Projeto SISTEMA BANC�RIO
* 
* destinada ao controle de funcionarios
*
*/

import java.util.Date;

public class Funcionarios {
	
	/*
	 * Os nomes de vari�veis n�o deve come�ar com underscore _ ou sinal de d�lar $
	 * personagens, mesmo que ambos sejam permitidos. Os nomes de vari�veis devem
	 * ser curtos, mas significativo. A escolha de um nome vari�vel deve ser
	 * mnem�nico, isto �, concebidos para indicar ao observador casual a inten��o da
	 * sua utiliza��o.
	 */
	
	//atributos
	int codigo;
	String funcao;
	String dpto;
	String setor;
	String nome;
	Date dataAdmissao;
	Date dataExclusao;
	String endereco;
	String telefone;
	double salario;
	double comissao;
	boolean status;
	
	/*
	 * M�todos devem ser verbos, com a letra min�scula em primeiro lugar, com a
	 * primeira letra de cada palavra interna em mai�scula.
	 */
	
	//metodos
	
	void pagarComissao() {
		
	}
	
	void pagarSalario() {
		
	}
	
	void estaAtivo() {
		
	}
	
	void criarConta() {
		
	}
	
	void fecharConta() {
		
	}
	
	void alterarLimite(Conta conta, double novolimite) {
		conta.mudarlimite(novolimite);
	}
	
	void transferirConta() {
		
	}
	
}
