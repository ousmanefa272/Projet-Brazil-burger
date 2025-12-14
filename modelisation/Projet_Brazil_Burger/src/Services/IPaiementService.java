package Services;

import Entity.Paiement;
import java.util.List;

public interface IPaiementService {

    void ajouterPaiement(Paiement p);

    List<Paiement> listerPaiements();
}
