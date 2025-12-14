package Services.Impl;
import Services.ICommandeService;
import Entity.Commande;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class CommandeServiceImpl implements ICommandeService {

    private List<Commande> commandes = new ArrayList<>();

    @Override
    public void ajouterCommande(Commande c){
        c.setDateCommande(LocalDateTime.now());
        commandes.add(c);
    }

    @Override
    public List<Commande> listerCommandes(){
        return commandes;
    }

    @Override
    public void changerEtat(int id, Commande.Etat etat){
      for (Commande c : commandes){
        if (c.getId() == id){
            c.setEtat(etat);
            break;
        }
    }
}


    @Override
    public void annulerCommande(Commande c){
        c.setEtat(Commande.Etat.ANNULEE);
    }

    @Override
    public void terminerCommande(Commande c){
        c.setEtat(Commande.Etat.TERMINEE);
    }
}

