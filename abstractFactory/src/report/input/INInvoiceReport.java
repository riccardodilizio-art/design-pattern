package report.input;

public class INInvoiceReport extends AINReport {


    public INInvoiceReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing INNPUT reports invoice specific stuff");
    }
}
