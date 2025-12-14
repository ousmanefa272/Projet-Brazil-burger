package Repository;

import Entity.Menu;
import java.util.List;

public interface IMenuRepository {
    void insert(Menu menu);
    List<Menu> findAll();
}