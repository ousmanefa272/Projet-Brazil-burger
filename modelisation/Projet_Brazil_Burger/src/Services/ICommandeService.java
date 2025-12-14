package Services;

import Entity.Commande;
import java.util.List;

public interface ICommandeService {
    void ajouterCommande(Commande c);
    List<Commande> listerCommandes();
    void changerEtat(int id, Commande.Etat etat);
    void annulerCommande(Commande c);
    void terminerCommande(Commande c);
}
