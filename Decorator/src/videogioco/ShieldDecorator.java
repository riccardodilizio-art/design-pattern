package videogioco;

public class ShieldDecorator extends CharacterDecorator{
    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " con scudo";
    }


    @Override
    public int getDefence() {
        return character.getDefence()+10;
    }
}
