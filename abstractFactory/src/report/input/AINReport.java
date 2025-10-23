package report.input;

import report.AReport;

public abstract class AINReport extends AReport {

    public AINReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing INNPUT report common stuff");

    }
}
