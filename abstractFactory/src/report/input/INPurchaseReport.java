package report.input;

public class INPurchaseReport extends AINReport {

    public INPurchaseReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing INPUT report purchase specific stuff");
    }

}
