
package ar.educacionit.curso.java.streams;

import java.util.List;

public interface I_File {
    
    // Devuelve el contenido de un archivo en un String
    String getText();
    
    // Imprime en consola el contenido de un archivo
    default void print(){
        System.out.println(getText());
    };
    
    // Ingresa un texto como parametro y lo escribe (reemplaza) en el archivo
    void setText(String text);
    
    // Ingresa un texto y lo apendiza (agrega) al archivo.
    void appendText(String text);
    
    // Recibe un texto como parametro, lo apendiza y pone un salto de linea al final.
    default void addLine(String linea){
        appendText(linea + "\n");
    };
    
    // Recibe una lista de lineas como parametro, recorre la lista y llama al metodo addLine por cada item de la lista. Agregando efectivamente todas las lineas
    // de la lista al archivo.
    default void addLines(List<String> lineas){
        lineas.forEach( item -> addLine(item) );
    }
    
    List<String> getAll();
}
