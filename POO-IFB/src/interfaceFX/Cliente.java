/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceFX;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) 
                throws UnknownHostException, IOException {
        // dispara cliente
        new Cliente("Professor","10.18.3.44", 12345).executa();
    }

    
    private String nome;
    private String host;
    private int porta;
    Socket cliente;
    PrintStream saida;
    InputStream entrada;
    
    public Cliente (String nome, String host, int porta) throws IOException {
        this.host = host;
        this.porta = porta;
        this.nome = nome;
        this.cliente = new Socket(this.host, this.porta);
        this.saida = new PrintStream(cliente.getOutputStream());
        this.entrada = cliente.getInputStream();
        System.out.println("O cliente se conectou ao servidor!");
    }
    
    

    public void enviarMensagem(String nome, String palitinhos, String aposta){
        String msg = "-"+nome+"#"+palitinhos+"#"+aposta;
        saida.println(msg);
    }
    
    
    public void executa() throws UnknownHostException, IOException {
        

        // thread para receber mensagens do servidor
        Recebedor r = new Recebedor(cliente.getInputStream());
        new Thread(r).start();

        // lê msgs do teclado e manda pro servidor
        Scanner teclado = new Scanner(System.in);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
        }

        saida.close();
        teclado.close();
        cliente.close();        
    }
    
    public InputStream getEntrada(){
        return this.entrada;
    }

    void enviarVai() {
        saida.println("VAI");
    }
}