package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class DinerRepository {

    public List<MenuItem> getTheMenu() {
        Iterator<MenuItem> it = this.getIterator();
        List<MenuItem> menuItems = new ArrayList<>();
        while(it.hasNext()) {
            menuItems.add((MenuItem) it.next());
        }
        return menuItems;
    }

    public Iterator<MenuItem> getIterator(){
        return new DinerMenu().createIterator();
    }
}
