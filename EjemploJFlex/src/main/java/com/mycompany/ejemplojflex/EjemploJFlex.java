/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplojflex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import mi.primer.scanner.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class EjemploJFlex {

    public static void main(String[] args) {
        
        try {
            Reader r = new FileReader("prueba.txt");
            Scanner scan = new Scanner(r);
            scan.yylex();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploJFlex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploJFlex.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
