package com.mycompany.atividadeum;
import java.util.Scanner;


public class AtividadeUm {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);   
        
        int i;
        int maior = 0;
        int pergunta;
        
       for(i = 0; i < 10; i++){
           System.out.printf("Insira o %d valor\n", i +1);
         pergunta = lerTeclado.nextInt();
        
       if(pergunta > maior){
           maior = pergunta;
       }
     }
       
     System.out.printf("O maior valor eh " +maior);
     
    }
      
}
