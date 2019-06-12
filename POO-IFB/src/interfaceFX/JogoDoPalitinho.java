/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceFX;

import java.io.IOException;

/**
 *
 * @author rotie
 */
public class JogoDoPalitinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new Cliente("Professor","10.18.3.44", 12345).executa();
    }
    
}