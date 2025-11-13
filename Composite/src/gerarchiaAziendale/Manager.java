package gerarchiaAziendale;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addTeam(Employee employee){
        this.team.add(employee);
    }
    public void removeTeam(Employee employee){
        this.team.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println(this.name + " " + this.position);
        for (Employee employee : this.team) {
            System.out.println("  ");
            employee.showDetails();
        }
    }
}
