/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablassimbolos;

import tablasimbolos.scanner.apuntadores.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class TablasSimbolos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner();
        String codigoFuente = "{x y {y z}}";
        scan.ejecutar(codigoFuente);
    }
    
}
