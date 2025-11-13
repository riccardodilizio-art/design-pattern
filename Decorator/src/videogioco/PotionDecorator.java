package videogioco;

public class PotionDecorator extends CharacterDecorator{
    public PotionDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " potenziato da una pozione" ;
    }

    @Override
    public int getAttack() {
        return character.getAttack() + 5;
    }

    @Override
    public int getDefence() {
        return character.getDefence() + 5;
    }
}
