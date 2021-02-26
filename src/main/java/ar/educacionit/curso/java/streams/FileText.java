package ar.educacionit.curso.java.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileText implements I_File {    
   private File archivo;
   
   public FileText(File file){
       this.archivo = file;
   }
   
   public FileText(String rutaFile){
       this.archivo = new File(rutaFile);
   }

    @Override
    public String getText() {
        String text = "";
        int car;
        
        try (FileReader in = new FileReader(archivo);){
            while((car = in.read()) != -1){
                text += (char)car;
            }
        } catch (FileNotFoundException ex){
            System.out.println("No se encontro el archivo.");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return text;
    }

    @Override
    public void setText(String texto) {
        try (FileWriter out = new FileWriter(archivo);){
            out.write(texto);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // La unica diferencia con el metodo setText es que aqui se le agrega un booleando true, con eso le indico al FileWriter que abra el programa
    // para apendizar, en lugar de sobreescribir los datos.
    
    @Override
    public void appendText(String text) {
        try (FileWriter out = new FileWriter(archivo, true);){
            out.write(text);
        } catch (Exception e) {
        }
    }

    @Override
    public void addLines(List<String> lineas) {
        try (FileWriter out = new FileWriter(archivo, true)){
            for(String s: lineas){
                out.write(s + "\n");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public List<String> getAll() {
        
        List<String> list = new ArrayList();
        String line="";
        
        try (BufferedReader in = new BufferedReader(new FileReader(archivo))){
//            while((line = in.readLine()) != null){
//                list.add(line);
//            }
            list = in.lines().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return list;
    }
   
   
}
