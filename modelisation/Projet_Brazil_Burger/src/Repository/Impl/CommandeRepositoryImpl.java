package Repository.Impl;

import Repository.ICommandeRepository;
import Entity.Commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeRepositoryImpl implements ICommandeRepository {

    private List<Commande> commandes = new ArrayList<>();

    @Override
    public void insert(Commande c) {
        commandes.add(c);
    }

    @Override
    public List<Commande> findAll() {
        return commandes;
    }
}
