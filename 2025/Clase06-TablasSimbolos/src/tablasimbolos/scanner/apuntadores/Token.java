/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasimbolos.scanner.apuntadores;

/**
 *
 * @author miguelcatalan
 */
public class Token {
    private String nombre;
    private String atributo;

    public Token(String nombre) {
        this.nombre = nombre;
    }

    public Token(String nombre, String atributo) {
        this.nombre = nombre;
        this.atributo = atributo;
    }
    
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    
    @Override
    public String toString() {
        return "Token: " + nombre + 
                " Atributo: " + atributo;
    }
    
}
