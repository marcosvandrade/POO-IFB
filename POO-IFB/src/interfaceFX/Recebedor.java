/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceFX;


import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {

    private InputStream servidor;
    private Tela tela;

    public Recebedor(InputStream servidor) {
        this.servidor = servidor;
    }

    Recebedor(InputStream entrada, Tela tela) {
        this.servidor = entrada;
        this.tela = tela;
    }

    public void run() {
        // recebe msgs do servidor e imprime na tela
        Scanner s = new Scanner(this.servidor);
        while (s.hasNextLine()) {
            String msg =s.nextLine();
            tela.AdicionarMensagem(msg);
            System.out.println(msg);
        }
    }
}