package videogioco;

public class SwordDecorator extends CharacterDecorator {
    public SwordDecorator(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return  character.getDescription() + " con spada magica";
    }

    @Override
    public int getAttack() {
        return character.getAttack() + 15;
    }
}
