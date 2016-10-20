package lista_revisao;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {//classe criada para fazer trabalhos no URI Online Judge
 
    public static void main(String[] args) throws IOException {
        
        int x;
        double y;
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        x = Integer.parseInt(input.next());
        y = Double.parseDouble(input.next());
        
        if(x == 1)
      	  y = y*4;
        else if(x == 2)
      	  y = y*4.5;
        else if(x == 3)
      	  y = y*5;
        else if(x == 4)
      	  y = y*2;
        else if(x == 5)
      	  y = y*1.5;
         
         System.out.println("Total: R$ "+deci.format(y));
    }
 
}