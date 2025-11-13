package gerarchiaAziendale;

public class Demo {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "Java Developer");
        Employee dev2 = new Developer("Bob", "Frontend Developer");
        Employee designer1 = new Designer("Clara", "UX Designer");

        Manager teachLead = new Manager("David", "Tech Lead");
        teachLead.addTeam(dev1);
        teachLead.addTeam(dev2);

        Manager designManager = new Manager("Eva","Design Manager");
        designManager.addTeam(designer1);

        Manager ceo = new Manager("Frank", "CEO");
        ceo.addTeam(teachLead);
        ceo.addTeam(designManager);

        ceo.showDetails();
    }
}
