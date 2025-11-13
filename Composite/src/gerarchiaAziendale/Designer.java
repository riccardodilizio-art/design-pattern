package gerarchiaAziendale;

public class Designer implements Employee{
    private String name;
    private String position;

    public Designer(String name, String position){
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(this.name + " " + this.position);
    }
}
