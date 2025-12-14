package Services;

import Entity.Burger;
import java.util.List;

public interface IBurgerService {
    void ajouterBurger(Burger b);
    List<Burger> listerBurgers();
}
