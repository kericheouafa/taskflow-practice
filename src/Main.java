import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionnaireTaches gestionnaire = new GestionnaireTaches();
        int choix = 0;

        while (choix != 4) {
            System.out.println("\n=== TASKFLOW ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher toutes les tâches");
            System.out.println("3. Terminer une tâche");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            try {
                choix = scanner.nextInt();
                scanner.nextLine();

                switch (choix) {
                    case 1:
                        System.out.print("Titre : ");
                        String titre = scanner.nextLine();
                        System.out.print("Priorité (1, 2 ou 3) : ");
                        int priorite = scanner.nextInt();
                        gestionnaire.ajouterTache(new Tache(titre, priorite));
                        System.out.println("✅ Tâche ajoutée !");
                        break;
                    case 2:
                        gestionnaire.afficherTout();
                        break;
                    case 3:
                        System.out.print("Titre de la tâche à terminer : ");
                        String t = scanner.nextLine();
                        gestionnaire.terminerTache(t);
                        System.out.println("✅ Tâche terminée !");
                        break;
                    case 4:
                        System.out.println("Au revoir ! 👋");
                        break;
                    default:
                        System.out.println("⚠️ Choix invalide !");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Tape un chiffre !");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}