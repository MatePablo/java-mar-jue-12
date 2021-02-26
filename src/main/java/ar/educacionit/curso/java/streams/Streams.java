package ar.educacionit.curso.java.streams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Streams {
    public static void main(String[] args) throws IOException{
        
        /*
        
        --- STREAMS --- :
        
        > Es un medio utilizado para leer o escribir datos en un destino. Tanto la fuente como el destino pueden ser archivos, cadena de texto, sockets, memoria y procesos.
        > Son unidireccionales, es decir, solo se pueden utilizar para leer o escribir, no ambas cosas al mismo tiempo.
        
        >> INPUT Y OUTPUT:
        > La accion de leer se conoce como INPUT, la accion de escribir como OUTPUT.
        > En Java, todas las clases utilizadas para INPUT y OUTPUT estan en el paquete java.io
        
        
        - FILE STREAMS -        
        > Son streams utilizados para la lectura y escritura (particularmente) de archivos. 
        > En general se usan con un objeto del tipo File, que es una representacion abstracta del archivo. La clase File modela tanto archivos como directorios.   
        > Es una categoria que agrupa tanto los streams orientados a caracter, como los orientados a byte:        
        
            1) STREAMS ORIENTADOS A CARACTERES:
            > Operan con caracteres como unidad de trabajo, cada caracter esta formado por 2 bytes (16 bites)
            > Se utilizan para leer y escribir informacion almacenada a modo de texto. (.txt , .ini, .csv etc)
        
        
            2) STREAMS ORIENTADOS A BYTE:
            > Operan con bytes como unidad de trabajo. Los cuales se leen de forma unitaria. (8 bits por byte)
            > Se utilizan para leer y escribir archivos que contienen informacion almacenada en forma binaria. ( .jpeg, .mpeg, .xls etc)
        
            >> Ambos tipos de Stream tienen dos superclases que se encargan de leer, y escribir archivos en sus respectivos formatos:
                1.a) Writer:    Superclase abstracta que se encarga de generar un stream para la lectura de archivos en formato de texto.
                1.b) Reader:    Superclase abstracta que se encarga de generar un stream para la escritura de archivos en formato de texto.
                2.a) OutputStream:  Superclase abstracta que se encarga de generar un stream para lectura de archivos en formato binario.
                2.b) InputStream:   Superclase abstracta que se encarga de generar un stream para la escritura de archivos en formato binario.
        */
        
        // Ejemplo de lectura de un archivo de texto:
        System.out.println("Ejemplo de lectura de un archivo de texto: ");
        
        
        File archivoFuente = new File("fuente.txt");    // Objeto File a usar en conjunto        
        FileReader in = new FileReader(archivoFuente);  // Clase Reader que abre el stream necesario para leer el archivo.
        
        int caracter;
        String texto = "";
        
        while((caracter = in.read()) != -1){
            texto += (char) caracter;
        }
        
        System.out.println(texto);
        
    }
}
