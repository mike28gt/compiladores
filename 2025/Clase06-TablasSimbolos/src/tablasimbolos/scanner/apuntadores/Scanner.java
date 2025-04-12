/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasimbolos.scanner.apuntadores;

import java.util.ArrayDeque;
import java.util.Deque;
import tablasimbolos.tabla.simbolos.Entorno;
import tablasimbolos.tabla.simbolos.Simbolo;

/**
 *
 * @author miguelcatalan
 */
public class Scanner {
    private String codigoFuente;
    char [] listaCaracteres;
    private int columna;
    private int estado;
    
    Entorno entorno = null;
    Deque<Entorno> pila = new ArrayDeque<>();
    
    public Scanner() {
        columna = 0;
        //El número de estado es el estado inicial 
        //del automata
        estado = 0;
    }
    
    public void ejecutar(String codigoFuente) {
        
        this.codigoFuente = codigoFuente;
        listaCaracteres = this.codigoFuente.toCharArray();
        
        while (columna < listaCaracteres.length) {
            Token token = obtenerToken();
            if (token != null) {
                System.out.println(token);
            }
        }
    }
    
    private char siguienteCaracter() {
        char caracter = ' ';
        
        if (this.columna < listaCaracteres.length) {
            caracter = this.listaCaracteres[this.columna];
            this.columna++;
        } else {
            System.err.println("Se alcanzó el final de la cadena.");
        }
        
        return caracter;
    }
    
    private void fallo() {
        this.estado = 0;
        this.columna = 0;
        System.err.println("La cadena no es válida.");
    }
    
    private void retractar() {
        this.columna--;
    }
    
    private Token obtenerToken() {
        estado = 0;
        char simbolo = ' ';
        StringBuilder identificador = new StringBuilder();
        
        while(true) {
        
            switch(this.estado) {
                
                case 0: simbolo = siguienteCaracter();
                        
                        if (simbolo == '{') {
                            this.estado = 1;
                        }
                        else if (simbolo == '}') {
                            this.estado = 2;
                        }
                        else if (Character.isLetter(simbolo)) {
                            this.estado = 3;
                        }
                        else if (simbolo == ' ' || simbolo == '\n' || simbolo == '\t') {
                            this.estado = 5;
                        }
                        else {
                            fallo();
                            return null;
                        }
                        break;
                case 1: //entorno = new Entorno(entorno);
                        pila.push(new Entorno());
                        return new Token("LlaveApertura", "{");
                case 2: 
                        //entorno.mostrarDatos();
                        //entorno = entorno.getAnterior();
                        pila.pop().mostrarDatos();
                        return new Token("LlaveCierre", "}");
                case 3: identificador.append(simbolo);
                        
                        simbolo = siguienteCaracter();
                        
                        if (Character.isLetterOrDigit(simbolo)) {
                            this.estado = 3;
                        }
                        else {
                            this.estado = 4;
                        }
                        break;
                case 4: retractar();
                        //entorno.put(identificador.toString(), new Simbolo(identificador.toString()));
                        pila.peek().put(identificador.toString(), new Simbolo(identificador.toString()));
                        return new Token("identificador", identificador.toString());
                case 5: simbolo = siguienteCaracter();
                
                        if (simbolo == ' ' || simbolo == '\n' || simbolo == '\t') {
                            this.estado = 5;
                        }
                        else {
                            this.estado = 6;
                        }
                case 6: retractar();
                        return null;
            }            
        }
    }
}
