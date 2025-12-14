package Services.Impl;

import Services.IBurgerService;
import Entity.Burger;
import java.util.ArrayList;
import java.util.List;

public class BurgerServiceImpl implements IBurgerService {

    private List<Burger> burgers = new ArrayList<>();

    @Override
    public void ajouterBurger(Burger b){
        burgers.add(b);
    }

    @Override
    public List<Burger> listerBurgers(){
        return burgers;
    }
}
