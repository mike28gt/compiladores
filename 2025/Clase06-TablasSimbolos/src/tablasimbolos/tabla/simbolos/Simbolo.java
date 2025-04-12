/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasimbolos.tabla.simbolos;

/**
 *
 * @author miguelcatalan
 */
public class Simbolo {
    
    private String nombre;
    private String tipo;
    private String lexema;
    private int posicion;
    
    public Simbolo() { }
    
    public Simbolo(String lexema) {
        this.lexema = lexema;
    }
    public Simbolo(String nombre, String tipo, String lexema, int posicion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.lexema = lexema;
        this.posicion = posicion;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public String toString() {
        return " | Simbolo -> lexema: " + lexema;
    }
}
