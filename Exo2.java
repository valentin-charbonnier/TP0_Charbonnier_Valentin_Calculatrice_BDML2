package exo2;
import java.util.Scanner;

public class Exo2 {
    
    public static void main(String[] args) {
        //Declaration des variables
        int nb; //nombre d'entiers a additionner 
        int result; //resultat
        int ind; //indice
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n entrer le nombre :");
        nb = sc.nextInt();
        result=0;
        
        //addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind = ind + 1;
        }
        // affichage du resultat 
        System.out.println();
        System.out.println("la somme des " + nb + " entiers est "+result);
    }
    
}
