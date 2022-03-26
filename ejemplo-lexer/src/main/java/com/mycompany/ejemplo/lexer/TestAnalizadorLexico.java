/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo.lexer;

import java.io.FileReader;
import java.io.Reader;
import jlex.test.Yylex;

/**
 *
 * @author miguelcatalan
 */
public class TestAnalizadorLexico {
    
    public static void main(String[] args) {
        
        Reader reader = new FileReader("");
        Yylex lex = new Yylex(reader);
        lex.yylex();
    }
    
}
