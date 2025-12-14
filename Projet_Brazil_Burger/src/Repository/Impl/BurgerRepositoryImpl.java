package Repository.Impl;
import Repository.IBurgerRepository;
import Entity.Burger;

import java.util.ArrayList;
import java.util.List;

public class BurgerRepositoryImpl implements IBurgerRepository {

    private List<Burger> burgers = new ArrayList<>();

    @Override
    public void insert(Burger burger) {
        burgers.add(burger);
    }

    @Override
    public List<Burger> findAll() {
        return burgers;
    }
}
