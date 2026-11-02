// TD0 Charbonnier Valentin Calculatrice exercice 1 bdml2  date :02/11/2026
package exo1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author valen
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    System.out.println("Bonjour");
    //    System.out.println("au revoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("bonjour quel est votre prenom ?");
        prenom = sc.nextLine();
        
        System.out.println("bonjour " + prenom + " !");
        System.out.println("Au revoir " +  prenom + "  !");

    }
    
}
