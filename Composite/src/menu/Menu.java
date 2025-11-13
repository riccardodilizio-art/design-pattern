package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
    private String name;
    private List<MenuComponent> items =  new ArrayList<MenuComponent>();

    public Menu(String name){
        this.name = name;
    }

    public void addItem(MenuComponent item){
        items.add(item);
    }

    public void removeItem(MenuComponent item){
        items.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Menu: "+name);
        for(MenuComponent item : items){
            item.showDetails();
        }
    }
}
