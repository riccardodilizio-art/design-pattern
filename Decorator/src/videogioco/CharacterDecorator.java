package videogioco;

abstract class CharacterDecorator implements Character{
    protected  Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getDescription() {
        return  character.getDescription();
    }

    @Override
    public int getAttack() {
        return character.getAttack();
    }
    @Override
    public int getDefence() {
        return character.getDefence();
    }
}
