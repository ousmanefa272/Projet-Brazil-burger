package Services.Impl;

import Entity.Paiement;
import java.util.ArrayList;
import java.util.List;

public class PaiementService {

    private List<Paiement> paiements = new ArrayList<>();

    public void ajouterPaiement(Paiement paiement) {
        paiements.add(paiement);
        System.out.println("Paiement ajouté avec succès !");
    }

    public void listerPaiements() {
        if (paiements.isEmpty()) {
            System.out.println("Aucun paiement enregistré.");
        } else {
            System.out.println("\n=== LISTE DES PAIEMENTS ===");
            for (Paiement p : paiements) {
                System.out.println(p);
            }
        }
    }
}
