/*
    Demande à l'utilisateur un nombre entier de 5 chiffres à l'utilisateur,
    on sépare le chiffre en chiffres individuels et les affiche en les séparant des uns
    des autres par trois espaces.
    
    Entrées:
        Nombre entier de 5 chiffres         Int
        
    Sorties:
        chiffres individuels                char

    Traitements:
        Stocke les 5 chiffres dans un int et convertit le int en String
        Stocke chaque chiffre dans une variable char avec des index
*/
import java.util.Scanner;
public class Chiffres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entier de 5 chiffres:");
        int nombre = sc.nextInt();
        String nombreStr = String.valueOf(nombre);  //  conversion de int en String
        
        //  Calcul!
        char premier = nombreStr.charAt(0);
        char second = nombreStr.charAt(1);
        char troisieme = nombreStr.charAt(2);
        char quatrieme = nombreStr.charAt(3);
        char cinquieme = nombreStr.charAt(4);
        
        //  Affichage!
        System.out.println(premier + "   " + second + "   " + troisieme + "   " + quatrieme + "   " + cinquieme);        
    }
}
/*
    Par Mohamed Chraiet
*/
