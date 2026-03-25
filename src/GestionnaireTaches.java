import java.util.ArrayList;

public class GestionnaireTaches {

    private ArrayList<Tache> taches;

    public GestionnaireTaches() {
        this.taches = new ArrayList<>();}



    public void ajouterTache(Tache t) {
        taches.add(t);
    }

    public void afficherTout() {
        System.out.println("=== MES TÂCHES ===");
        for (Tache t : taches) {
            t.afficherDetails();
        }
    }

    // Terminer une tâche par son titre
    public void terminerTache(String titre) {
        for (Tache t : taches) {
            if (t.getTitre().equals(titre)) {
                t.terminer();
            }
        }
    }

    // Compter les tâches restantes
    public int compterEnCours() {
        int compteur = 0;
        for (Tache t : taches) {
            if (!t.estTerminee()) {
                compteur++;
            }
        }
        return compteur;
    }
}