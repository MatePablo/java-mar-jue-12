package ar.educacionit.curso.java.streams.textos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    public static void main(String[] args) throws IOException{
        /*
        --- Clase concreta FileWriter ---
        
        > Es una clase concreta utilizada para generar streams orientados a caracter. La cual se encarga de realizar la escrituro en archivos de formato de texto.
        */
        
        // A continuacion un ejemplo de escritura en un archivo llamado "destino.txt"
        
        File archivoSalida = new File("res/archivo.txt");   // Defino el archivo a utilizar
        FileWriter out = new FileWriter(archivoSalida); // Abro el stream de salida
     
        String info = "Hola, soy lo que quiero escribir en el archivo.";    // Defino la informacion a escribir en el archivo
        
        out.write(info);
        
        // Cierro el stream
        out.close();
    }
}
