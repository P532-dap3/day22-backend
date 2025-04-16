package edu.iu.habahram.DinerPancakeHouseMerge.model;
import java.util.Iterator;
import java.util.List;

public class PancakeMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> items;
    int position = 0;

    public PancakeMenuIterator(List<MenuItem> items){
        this.items = items;
    }

    public MenuItem next(){
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext(){
        return position < items.size() && items.get(position) != null;
    }
}
