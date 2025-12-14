package Controllers;

import Entity.Commande;
import Services.ICommandeService;

public class CommandeController {

    private final ICommandeService service;

    public CommandeController(ICommandeService service) {
        this.service = service;
    }

    public void ajouterCommande(int id, String mode) {
        Commande cmd = new Commande(id, mode);
        service.ajouterCommande(cmd);
        System.out.println("Commande ajoutée !");
    }

    public void annulerCommande(int id) {
        for (Commande c : service.listerCommandes()) {
            if (c.getId() == id) {
                service.annulerCommande(c);
                System.out.println("Commande annulée !");
                return;
            }
        }
        System.out.println("Commande introuvable !");
    }

    public void terminerCommande(int id) {
        for (Commande c : service.listerCommandes()) {
            if (c.getId() == id) {
                service.terminerCommande(c);
                System.out.println("Commande terminée !");
                return;
            }
        }
        System.out.println("Commande introuvable !");
    }

    public void listerCommandes() {
        System.out.println("=== LISTE DES COMMANDES ===");
        for (Commande c : service.listerCommandes()) {
            System.out.println(c);
        }
    }
}
