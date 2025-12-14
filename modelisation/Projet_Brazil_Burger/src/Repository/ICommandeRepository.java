package Repository;

import Entity.Commande;
import java.util.List;

public interface ICommandeRepository {
    void insert(Commande c);
    List<Commande> findAll();
}