/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase04.analizadorlexico;

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
