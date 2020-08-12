
package Archivo;
import java.io.*;

public class Archivo {
    
    public static void main(String[] args) {
        
        //Instanciando File, necesitamos la ruta del archivo
        File file = new File("carpeta/archivo1.txt");
        
        //Metodo para saber si existe el archivo que estamos buscando
        System.out.println(file.exists());
        
        //Metodo para saber si es una carpeta o no
        System.out.println(file.isDirectory());
        
        //Imprime el nombre
        System.out.println(file.getName());
        
        //Crea una carpeta en la carpeta del proyecto 
//        System.out.println(file.mkdir());
        
//        for(String archivos: file.list()){
//            System.out.println(archivos);
//        }
        
        try{
            
            FileWriter fileWriter = new FileWriter("carpeta/archivo1.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            for (int i = 0; i < 10; i++) {
                printWriter.println(i);
            }
            printWriter.close();
            System.out.println("Se escribio correctamente el archivo");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        try{
            
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea = bufferedReader.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
