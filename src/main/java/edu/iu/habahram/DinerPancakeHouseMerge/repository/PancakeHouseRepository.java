package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class PancakeHouseRepository {
    public List<MenuItem> getTheMenu() {
        Iterator it = this.getIterator();
        List<MenuItem> menuItems = new ArrayList<>();
        while(it.hasNext()) {
            menuItems.add((MenuItem) it.next());
        }
        return menuItems;
    }

    public Iterator getIterator(){
        return new PancakeHouseMenu().createIterator();
    }
}
