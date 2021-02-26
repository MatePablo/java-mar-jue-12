package ar.educacionit.curso.java.streams.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copiador {
    public static void main(String[] args) throws IOException {
        /*
        --- FileInputStream y FileOutputStream ---        
        > Son las dos clases que generan streams orientados a byte. Se encargan de la lectura y escritura de archivos en forma binaria.
        
        >> A continuacion se presenta un ejemplo de lectura de un archivo llamado "imagen.gif" con InputStream y el hacerle una copia mediante OutputStream.
        */
        
        File fuente = new File("imagen.gif");
        File copia = new File("copiaImagen.gif");
        
        FileInputStream in = new FileInputStream(fuente);
        FileOutputStream out = new FileOutputStream(copia);
        
        int caracter;
        
        while((caracter = in.read()) != -1){
            out.write(caracter);
        }
        
        in.close();
        out.close();
    }
}
