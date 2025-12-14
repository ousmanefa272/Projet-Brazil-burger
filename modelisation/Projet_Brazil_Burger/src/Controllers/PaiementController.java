package Controllers;

import Entity.Paiement;
import Services.IPaiementService;

import java.util.List;

public class PaiementController {

    private IPaiementService service;

    public PaiementController(IPaiementService service) {
        this.service = service;
    }

    public void enregistrerPaiement(double montant, Paiement.Mode mode) {
        Paiement p = new Paiement(montant, mode);
        service.ajouterPaiement(p);
        System.out.println("Paiement enregistré !");
    }

    public void listerPaiements() {
        List<Paiement> paiements = service.listerPaiements();
        System.out.println("=== LISTE DES PAIEMENTS ===");
        for (Paiement p : paiements) {
            System.out.println(p);
        }
    }
}