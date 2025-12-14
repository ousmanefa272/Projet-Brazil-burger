package Repository;

import Entity.Paiement;
import java.util.List;

public interface IPaiementRepository {
    void insert(Paiement p);
    List<Paiement> findAll();
}