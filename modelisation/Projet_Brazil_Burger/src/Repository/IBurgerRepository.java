package Repository;

import Entity.Burger;
import java.util.List;

public interface IBurgerRepository {
    void insert(Burger burger);
    List<Burger> findAll();
}
