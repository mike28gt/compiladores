/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasimbolos.tabla.simbolos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miguelcatalan
 */
public class Entorno {
    private Map<String, Simbolo> tabla;
    private Entorno anterior;
    
    public Entorno() {
        tabla = new HashMap<>();
    }
    
    public Entorno(Entorno p) {
        tabla = new HashMap<>();
        anterior = p;
    }
    
    public Entorno getAnterior() {
        return anterior;
    }
    
    public void put(String nombre, Simbolo simbolo) {
        tabla.put(nombre, simbolo);
    }
    
    public Simbolo get(String simbolo) {
        for (Entorno e = this; e != null; e = e.getAnterior()) {
            Simbolo encontro = (Simbolo)e.tabla.get(simbolo);
            
            if (encontro != null) {
                return encontro;
            }
        }
        
        return null;
    }
    
    public void mostrarDatos() {
        System.out.println("Datos de Tabla de Símbolos");
        tabla.forEach((llave, valor) -> System.out.println(llave + " " + valor));
    } 
}
