/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.clase13.implementacionjflexycup;

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
public class Clase13ImplementacionJFlexyCup {

    public static void main(String[] args) {
        try {
            
            Reader r = new FileReader("prueba.txt");
            AnalizadorLexico al = new AnalizadorLexico(r);
            parser p = new parser(al);
 
            p.parse();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase13ImplementacionJFlexyCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Clase13ImplementacionJFlexyCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Clase13ImplementacionJFlexyCup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
