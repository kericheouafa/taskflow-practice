//java
public class Main {
    public static void main(String[] args) {

        GestionnaireTaches gestionnaire = new GestionnaireTaches();

        gestionnaire.ajouterTache(new Tache("Installer Java", 1));
        gestionnaire.ajouterTache(new Tache("Apprendre la POO", 2));
        gestionnaire.ajouterTache(new Tache("Créer une API Spring Boot", 3));

        gestionnaire.afficherTout();
        // On termine une tâche
        gestionnaire.terminerTache("Installer Java");

// On réaffiche
        System.out.println("=== APRÈS MISE À JOUR ===");
        gestionnaire.afficherTout();

// On compte ce qui reste
        System.out.println("Tâches en cours : " + gestionnaire.compterEnCours());
    }
}