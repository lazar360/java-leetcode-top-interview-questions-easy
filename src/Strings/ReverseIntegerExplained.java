package Strings;

public class ReverseIntegerExplained {

    public static void main(String[] args) {
        int x = 1234;
        long reversed = 0; // on ne peut pas aller au-delà de la max value d'un integer
        while (x != 0) {
            // 1- On selectionne le dernier chiffre
            int digit = x % 10; // 4

            // 2- On enlève ce chiffre en divisant  par 10 : 1234 -> 123
            x /= 10;

            // 3- On multiplie par 10 pour bouger de chiffre et on ajoute le chiffre
            // 3.1- premier passage : 0*10 -> rien et + digit -> reversed = 4
            // 3.2- deuxieme passage : 4*10 -> 40 et + digit -> reversed = 43...
            reversed = reversed * 10 + digit;

            //4- On regarde si x !=0 et on refait l'opération
        }
        System.out.println(reversed);
    }

}
