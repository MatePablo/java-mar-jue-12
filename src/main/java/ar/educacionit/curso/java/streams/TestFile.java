package ar.educacionit.curso.java.streams;

import java.util.List;

public class TestFile {
    public static void main(String[] args) {
        
        String file = "res/textoPrueba.txt";        
        I_File fText = new FileText(file);
        
        fText.setText("Esto es un texto de prueba que quiero insertar en el archivo, y luego leerlo.");
        fText.setText("Este es otro texto de prueba, que va a reemplazar todo lo anterior que escribi en el archivo.");
        
        fText.appendText("\nPero esto no lo va a reemplazar, ya que lo estoy apendizando en lugar de reemplazar.\n");
        
        fText.addLine("Aqui estoy agregando una linea que tiene salto de linea al final.");
        fText.addLine("Lunes.");
        fText.addLine("Martes.");
        fText.addLine("Miercoles.");
        fText.addLine("Jueves.");
        fText.addLine("Viernes.");
        fText.addLine("Lunes.");
        
        // List.of es un metodo que no podria ponerlo en un JSP, por que es de la version 9 de java, y el server todavia usa 8
        fText.addLine("Lo siguiente es una lista de lineas que voy a agregar mediante el metodo addLines:");
        
        List<String> semana = List.of("Primavera", "Otonoño", "Invierno", "Verano", "Primavera");        
        fText.addLines(semana);
        
        fText.print();
        
        System.out.println("Recorriendo todo el archivo con getAll(): ");
        fText.getAll().forEach( item -> System.out.println(item));
        
        System.out.println("\nMuestro solo las filas que contengan la letra m: ");
        fText.getAll()
                .stream()
                .filter( s -> s.toLowerCase().contains("m") )
                .forEach( item -> System.out.println(item) );
    }
}
