package ar.educacionit.curso.java.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamRemoto {
    public static void main(String[] args) throws MalformedURLException, IOException {
        /*
            Puedo crear un stream de un archivo remoto, como una pagina web.
        
            > En este caso, voy a usar un BufferedReader que envuelva un InputStreamReader
            para leer el archivo remoto que seria la pagina HOME de MercadoLibre.
        */
        
        boolean eof = false;
        String linea = "";
        
        try {
            URL url = new URL("https://www.mercadolibre.com.ar");
            try (BufferedReader out = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));){
                
                while(eof != true){
                    if (linea != null) {
                        linea = out.readLine();
                        System.out.println(linea);                        
                    }else{
                        eof = true;
                    }
                }
            } catch (Exception e) {
            }
        } catch (MalformedURLException ex){
            System.out.println("Error, la url ingresada es incorrecta: "+ex.toString());
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e);
        }
        
        
    }
}
