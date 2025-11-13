package videogioco;

public class BasicWarrior implements Character{
    @Override
    public String getDescription() {
        return "Guerriero base";
    }

    @Override
    public int getAttack() {
        return 10;
    }
    @Override
    public int getDefence() {
        return 5;
    }
}
