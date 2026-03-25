import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionnaireTaches gestionnaire = new GestionnaireTaches();

        System.out.println("=== TASKFLOW ===");
        System.out.print("Entre le titre de ta tâche : ");
        String titre = scanner.nextLine();

        int priorite = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            try {
                System.out.print("Entre la priorité (1, 2 ou 3) : ");
                priorite = scanner.nextInt();
                saisieValide = true;
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Erreur ! Tape un chiffre : 1, 2 ou 3.");
                scanner.nextLine();
            }
        }

        gestionnaire.ajouterTache(new Tache(titre, priorite));
        gestionnaire.afficherTout();
        scanner.close();
    }
}