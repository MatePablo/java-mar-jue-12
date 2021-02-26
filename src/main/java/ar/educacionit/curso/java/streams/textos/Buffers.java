package ar.educacionit.curso.java.streams.textos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffers {
    public static void main(String[] args) {
        /*
        --- Buffers ---        
        > Son subclases de las clases Reader, Writer, InputStream y OutputStream respectivamente.
        > Cumplen las mismas funciones que estas clases, pero son eficientes ya que guardan en un
        buffer los caracteres leidos/escritos para una mejora de la lectura/escritura.
        
        > Son utilizados como "wrappers" (envoltorios) de las clases basicas.
        
            1) -- BufferedReader --
            > Clase que hereda de la clase Reader, y se usa para envolver ("wrapper") otras subclases de Writer
            como lo es "FileReader"
        
            >> Uno de sus metodos mas usados es el "readLine()" que lee un conjunto de caracteres
            retornados como String, en lugar de leer caracter por caracter.
        
            2) -- BufferedWriter --
            > Subclase de la clase Writer, se usa para envolver otras subclases de Writer como lo es
            "FileWriter".
        
            >> Entre sus metodos mas utilizados esta write(String s, int offset, int length) que escribe
            un conjunto de caracteres en lugar de hacerlo caracter a caracter.
            >> Y tambien newLine() que escribe un salto de linea. Esto es por que se entiende que los saltos
            de linea son distintos segun el sistema operativo (no siempre es el enter).
            
        
        */
        
        // Ejemplo de uso de la clase BufferedWriter        
        File archivo = new File("res/archivoBuffer.txt");        
        String linea1 = "Hola, soy la linea que quiero escribir con el BufferedWriter";
        String linea2 = "Hola, soy otra linea que quiero escribir con el BufferedWriter";
        String linea3 = "Estas 3 lineas luego las leere con el BufferedReader";
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter(archivo));){
            out.write(linea1, 0, linea1.length());
            out.newLine();
            out.write(linea2, 0, linea2.length());
            out.newLine();
            out.write(linea3, 0, linea3.length());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // Ejemplo de uso de la clase BufferedReader        
        
        String lineaLeida = "";
        boolean eof = false;
        
        try (BufferedReader out = new BufferedReader(new FileReader(archivo));){
            
            while(eof != true){
                
                lineaLeida = out.readLine();
                
                if(lineaLeida != null){
                    System.out.println(lineaLeida);
                }else{
                    eof = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
