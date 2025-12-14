package Repository.Impl;

import Repository.IPaiementRepository;
import Entity.Paiement;

import java.util.ArrayList;
import java.util.List;

public class PaiementRepositoryImpl implements IPaiementRepository {

    private List<Paiement> paiements = new ArrayList<>();

    @Override
    public void insert(Paiement p) {
        paiements.add(p);
    }

    @Override
    public List<Paiement> findAll() {
        return paiements;
    }
}


