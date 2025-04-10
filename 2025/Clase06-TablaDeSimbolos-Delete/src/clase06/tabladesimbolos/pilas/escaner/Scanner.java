/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase04.analizadorlexico;

/**
 *
 * @author miguelcatalan
 */
public class Scanner {
    private String codigoFuente;
    char [] listaCaracteres;
    private int columna;
    private int estado;
    
    public Scanner() {
        columna = 0;
        //El número de estado es el estado inicial 
        //del automata
        estado = 0;
    }
    
    public void ejecutar(String codigoFuente) {
        
        this.codigoFuente = codigoFuente;
        listaCaracteres = this.codigoFuente.toCharArray();
        
        Token token = obtenerOpRel();
    
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
    
    private Token obtenerOpRel() {
        Token token = new Token("oprel");
        char simbolo = ' ';
        
        while(true) {
        
            switch(this.estado) {
                
                case 0: simbolo = siguienteCaracter();
                        
                        if (simbolo == '<') {
                            this.estado = 1;
                        }
                        else if (simbolo == '=') {
                            this.estado = 5;
                        }
                        else if (simbolo == '>') {
                            this.estado = 6;
                        }
                        else {
                            fallo();
                            return null;
                        }
                        break;
                case 1: simbolo = siguienteCaracter();
                
                        if (simbolo == '=') {
                            this.estado = 2;
                        }
                        else if (simbolo == '>'){
                            this.estado = 3;
                        }
                        else {
                            this.estado = 4;
                        }
                        break;
                case 2: token.setAtributo("<=");
                        System.out.println(token);
                        return token;
                case 3: token.setAtributo("<>");
                        System.out.println("Se reconoce el token <>");
                        return token;
                case 4: token.setAtributo("<");
                        System.out.println("Se reconoce el token <");
                        retractar();
                        return token;
                case 5: token.setAtributo("=");
                        System.out.println("Se reconoce el token =");
                        return token;
                case 6: simbolo = siguienteCaracter();
                        
                        if (simbolo == '=') {
                            this.estado = 7;
                        }
                        else {
                            this.estado = 8;
                        }
                        
                        break;
                case 7: token.setAtributo(">=");
                        System.out.println("Se reconoce el token >=");
                        return token;
                case 8: token.setAtributo(">");
                        System.out.println("Se reconoce el token >");
                        retractar();
                        return token;
            }
            
        }
        
    }
}
