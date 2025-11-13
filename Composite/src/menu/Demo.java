package menu;

import java.util.Scanner;

public class Demo{
    public static void main(String args[]){
        MenuItem pasta = new MenuItem("Spaghetti alla Carbonara", 9.50);
        MenuItem pizza = new MenuItem("Pizza Margherita", 8.00);
        MenuItem tiramisu = new MenuItem("Tiramisù", 4.50);
        MenuItem caffe = new MenuItem("Caffè", 1.20);

        Menu menuPrimi = new Menu("Primi piatti");

        menuPrimi.addItem(pasta);

        Menu menuSecondi  = new Menu("Secondi");
        menuSecondi.addItem(pizza);

        Menu menuDolci = new Menu("Dolci");
        menuDolci.addItem(tiramisu);

        Menu menuAmari = new Menu("Amari");
        menuAmari.addItem(caffe);

        Menu menuPrincipale =  new Menu("Principale");
        menuPrincipale.addItem(menuPrimi);
        menuPrincipale.addItem(menuSecondi);
        menuPrincipale.addItem(menuDolci);
        menuPrincipale.addItem(menuAmari);

        menuPrincipale.showDetails();
    }
}
