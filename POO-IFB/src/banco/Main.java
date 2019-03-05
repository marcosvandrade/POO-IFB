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
 * Copyright notice			Método Principal do projeto SISTEMA BANCÁRIO
 *  
 */

// PRIMEIRO O PACOTE E DEPOIS OS IMPORTs, SE HOUVEREM

// O NOME DO PACOTE É UM COMPONENTE ÚNICO, ESCRITO EM MINÚSCULOS
package banco; /* domínio local */

import com.sun.org.apache.xerces.internal.dom.DeferredProcessingInstructionImpl;

/*- 
 * Este comentário deve conter todas as informações da classe ou interface de
 * forma ampla visando sua documentação.
 */

/**
 * Classe Principal do Projeto SISTEMA BANCÁRIO
 * 
 * destinada a criação dos objetos
 *
 */

/*-
 * Os nomes de classe devem ser substantivos, em maiúsculas e minúsculas com a
 * primeira letra de cada palavra interna em maiúscula. Tente manter seus nomes
 * de classe simples e descritivo. Sempre evite palavras-ligadas , evite todas
 * siglas e abreviaturas, seja semântico.
 */

public class Main {

/*-
 * Alinhamento do código
 *
 * Inicie com 4 espaços ou um tab. A construção exata do recuo
 * (espaços vs tabs) é indeterminado.
 *
 * Evite linhas com mais de 80 caracteres, uma vez que em alguns terminais fica
 * mais difícil de ler.	
 */
	
	public static void main(String[] args) {
/*-  
 * Comentários muito curtos podem aparecer na mesma linha do código que está
 * inserida, mas deve ser deslocado o suficiente para separá-los das
 * declarações.
 * Se mais de um breve comentário aparecer em um trecho de código, todos eles
 * deverão ser recuados para a definição mesma guia, deixando sempre
 * alinhados.
 */
		//tarefa 1 - Criar cliente e atribuir uma conta
		Cliente marcos = new Cliente("Marcos", "12345678-99", "Rua 1"); 		   /* instancia da classe Cliente*/
		Conta contaDoMarcos = new Conta("654321", "corrente", 150.00);
		marcos.atribuirConta(contaDoMarcos);
		
		//tarefa 2 - Operações de saque, depósito e transferência
		
		
		
		System.out.println(marcos.toString());
		
	}
}