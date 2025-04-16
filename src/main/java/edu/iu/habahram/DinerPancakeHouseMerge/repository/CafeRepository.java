package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CafeRepository {
    public List<MenuItem> getItems() {
        CafeMenu cafeMenu = new CafeMenu();
        List<MenuItem> result = new ArrayList<>();
        Iterator<MenuItem> it = cafeMenu.createIterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
        return result;
    }
}