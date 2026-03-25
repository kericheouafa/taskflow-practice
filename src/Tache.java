public class Tache {


    // Les attributs
    private String titre;
    private boolean estTerminee;
    private int priorite;

    // Le constructeur
    public Tache(String titre, int priorite) {
        this.titre = titre;
        this.priorite = priorite;
        this.estTerminee = false;
    }

    // Marquer comme terminée
    public void terminer() {
        this.estTerminee = true;
    }

    // Afficher la tâche
    public void afficher() {
        String statut = estTerminee ? "✓ Terminée" : "⏳ En cours";
        System.out.println("[" + priorite + "] " + titre + " — " + statut);
    }

    public void afficherDetails() {
        String statut = estTerminee ? "✓ Terminée" : "⏳ En cours";
        System.out.println("Titre    : " + titre);
        System.out.println("Priorité : " + priorite);
        System.out.println("Statut   : " + statut);
        System.out.println("----------");
    }
    public String getTitre() {
        return this.titre;
    }

    public boolean estTerminee() {
        return this.estTerminee;
    }
}