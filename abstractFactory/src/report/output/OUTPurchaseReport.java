package report.output;

public class OUTPurchaseReport extends AOUTReport {

    public OUTPurchaseReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing OUTPUT report purchase specific stuff");
    }
}
