package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.*;

public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public Object next(){
        if(hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();

            stack.push(component.createIterator());

            return component;
        }else{
            return null;
        }
    }

    public boolean hasNext(){
        while (!stack.isEmpty()) {
            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
            }
        }
        return false;
    }
}
