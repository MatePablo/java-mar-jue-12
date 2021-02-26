package ar.educacionit.curso.java.streams.textos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*     
        --- Clase concreta FileReader ---     
        
        > Es una clase concreta que se utiliza para generar Streams orientados a caracter. Y se encarga de leer archivos con informacion en formato de texto.    
        */
        
        
        // A continuacion un ejemplo de lectura de un archivo llamado "fuente.txt"        
        System.out.println("Ejemplo de lectura de un archivo de texto: ");

        File archivoFuente = new File("res/archivo.txt");    // Objeto File a usar en conjunto. (Defino el archivo a utilizar)
        
        FileReader in = new FileReader(archivoFuente);  // Clase Reader que abre el stream necesario para leer el archivo.
        int caracter;
        String texto = "";

        /*
            > Recorro el texto, asigno el caracter leido con in.read() a la variable caracter.
            > Mientras el caracter leido no sea -1 (Es decir, el final del texto), que agregue lo guardado en la variable caracter a la variable texto
            > Cuando termine el while, que imprima con un SOUT la variable texto.
        */
        while((caracter = in.read()) != -1){
            texto += (char) caracter;
        }
        
        System.out.println(texto);
        
        in.close();
    }
}
