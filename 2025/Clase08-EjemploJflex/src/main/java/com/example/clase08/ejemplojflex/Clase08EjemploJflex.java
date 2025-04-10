/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.clase08.ejemplojflex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class Clase08EjemploJflex {

    public static void main(String[] args) {
        
        try {
            Reader r = new FileReader("prueba.txt");
            AnalizadorLexico a = new AnalizadorLexico(r);
            a.yylex();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase08EjemploJflex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Clase08EjemploJflex.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
