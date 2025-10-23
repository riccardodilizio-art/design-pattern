package report.output;

public class OUTInvoiceReport extends AOUTReport {

    public OUTInvoiceReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing OUTPUT report invoice specific stuff");
    }
}
