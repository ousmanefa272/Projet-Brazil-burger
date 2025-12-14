package Repository.Impl;
import Repository.IMenuRepository;
import Entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuRepositoryImpl implements IMenuRepository {

    private List<Menu> menus = new ArrayList<>();

    @Override
    public void insert(Menu menu) {
        menus.add(menu);
    }

    @Override
    public List<Menu> findAll() {
        return menus;
    }
}
