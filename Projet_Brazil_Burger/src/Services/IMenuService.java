package Services;

import Entity.Menu;
import java.util.List;

public interface IMenuService {
    void ajouterMenu(Menu m);
    List<Menu> listerMenus();
}