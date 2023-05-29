/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jflexycup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import umg.compiladores.*;

/**
 *
 * @author miguelcatalan
 */
public class JFlexYCup {

    public static void main(String[] args) throws Exception {
        try {
            Reader reader = new FileReader("/Users/miguelcatalan/Desktop/test.txt");
            parser p = new parser(new Lexer(reader));
            Object result = p.parse().value;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFlexYCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFlexYCup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
