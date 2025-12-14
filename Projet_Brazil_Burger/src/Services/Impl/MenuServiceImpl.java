package Services.Impl;
import Services.IMenuService;
import Entity.Menu;
import java.util.ArrayList;
import java.util.List;

public class MenuServiceImpl implements IMenuService {

    private List<Menu> menus = new ArrayList<>();

    @Override
    public void ajouterMenu(Menu menu) {
        menus.add(menu);
    }

    @Override
    public List<Menu> listerMenus() {
        return menus;
    }
}
