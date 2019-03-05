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
 * Copyright notice			M�todo Principal do projeto SISTEMA BANC�RIO
 *  
 */

// PRIMEIRO O PACOTE E DEPOIS OS IMPORTs, SE HOUVEREM

// O NOME DO PACOTE � UM COMPONENTE �NICO, ESCRITO EM MIN�SCULOS
package banco; /* dom�nio local */

import com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl;

/*- 
 * Este coment�rio deve conter todas as informa��es da classe ou interface de
 * forma ampla visando sua documenta��o.
 */

/**
 * Classe Principal do Projeto SISTEMA BANC�RIO
 * 
 * destinada a cria��o dos objetos
 *
 */

/*-
 * Os nomes de classe devem ser substantivos, em mai�sculas e min�sculas com a
 * primeira letra de cada palavra interna em mai�scula. Tente manter seus nomes
 * de classe simples e descritivo. Sempre evite palavras-ligadas , evite todas
 * siglas e abreviaturas, seja sem�ntico.
 */

public class Main {

/*-
 * Alinhamento do c�digo
 *
 * Inicie com 4 espa�os ou um tab. A constru��o exata do recuo
 * (espa�os vs tabs) � indeterminado.
 *
 * Evite linhas com mais de 80 caracteres, uma vez que em alguns terminais fica
 * mais dif�cil de ler.	
 */
	
	public static void main(String[] args) {
/*-  
 * Coment�rios muito curtos podem aparecer na mesma linha do c�digo que est�
 * inserida, mas deve ser deslocado o suficiente para separ�-los das
 * declara��es.
 * Se mais de um breve coment�rio aparecer em um trecho de c�digo, todos eles
 * dever�o ser recuados para a defini��o mesma guia, deixando sempre
 * alinhados.
 */
		//tarefa 1 - Criar cliente e atribuir uma conta
		Cliente marcos = new Cliente("Marcos", "12345678-99", "Rua 1"); 		   /* instancia da classe Cliente*/
		Conta contaDoMarcos = new Conta("654321", "corrente", 150.00);
		marcos.atribuirConta(contaDoMarcos);
		
		//tarefa 2 - Opera��es de saque, dep�sito e transfer�ncia
		
		
		
		System.out.println(marcos.toString());
		
	}
}