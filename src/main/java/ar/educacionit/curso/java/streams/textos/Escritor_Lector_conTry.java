package ar.educacionit.curso.java.streams.textos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Escritor_Lector_conTry {
    public static void main(String[] args) {
        
        /*
        En este caso creare un archivo, insertare texto y leere el archivo utilizando un auto-closeable en el try.
        
        Esto hace que no tenga que cerrar manualmente el proceso FileWriter y FileReader. Y que se cierre automaticamente una vez que termine el bloque
        de codigo Try.
        */
        
        
        String archivo = "res/archivoPruebaTry.txt";    // Ruta del archivo
        File file = new File(archivo);                  // Instancio al objeto File
        
        String texto = "Hola, soy el texto a insertar en el archivo.";  // Texto a insertar
        
        try (FileWriter out = new FileWriter(archivo);){
            out.write(texto);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int car;
        String txt="";
        
        try (FileReader in = new FileReader(file)){
            while((car = in.read()) != -1){
                txt += (char) car;
            }
        } catch (FileNotFoundException ex){
            System.out.println("No se encontro el archivo.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(txt);
    }
}
