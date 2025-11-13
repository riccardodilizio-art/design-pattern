package videogioco;

public class Demo {
    public static void main(String[] args) {
        Character warrior = new BasicWarrior();

        System.out.println(warrior.getDescription()+
                " | Attacco: "+ warrior.getAttack() +
                " | Difesa: "+ warrior.getDefence());

        warrior = new ShieldDecorator(warrior);
        warrior = new SwordDecorator(warrior);
        warrior = new PotionDecorator(warrior);

        System.out.println(warrior.getDescription() +
                " | Attacco: " + warrior.getAttack() +
                " | Difesa: " + warrior.getDefence());
    }
}
