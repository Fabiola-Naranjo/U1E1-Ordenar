package ordenarpalabratxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    public static void main(String[] args) throws FileNotFoundException {
        
        Archivo leer=new Archivo();
        leer.Archivo();
    }
    public void Archivo() throws FileNotFoundException{
        
        String [] ordenado = {"Fabiola","Naranjo","Sierra"};
        String [] desordenado = new String[3];
        String[] correcta= new String[3];
        
        File Leer = new File("leer.txt");//manda a llamar el txt
        FileReader leer = new FileReader(Leer);//lee archivo
        Scanner s = new Scanner(Leer);
        String leebfread;
        int cont = 0;
        
    
        while (s.hasNext()) { 
            desordenado[cont] = s.nextLine(); 
            cont++; 
        }
        System.out.println("Cadena Desordenada");
         for (int i = 0; i <= ordenado.length - 1; i++) {
            for (int j = 0; j <= desordenado.length - 1; j++) {
                if (ordenado[i].equals(desordenado[j])) {
                    correcta[i] = desordenado[j];
                    System.out.println(desordenado[i]);
             }
            }
        }
         System.out.println("Cadena Ordenada");
           for(int i=0;i<correcta.length;i++){
             System.out.println(correcta[i]);
        }
    }
}
