package report.output;

import report.AReport;

public abstract class AOUTReport extends AReport {


    public AOUTReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing OUTPUT report common stuff");
    }
}
