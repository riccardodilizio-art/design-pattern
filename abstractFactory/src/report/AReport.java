package report;

public abstract class AReport {
    public String name;

    public AReport(String name) {
        this.name = name;
    }

    public void processReport() {
        System.out.println("Processando report: " + this.name);
    }
}
