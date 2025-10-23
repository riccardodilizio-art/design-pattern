package report.factories;

import report.*;
import report.output.OUTInvoiceReport;
import report.output.OUTPurchaseReport;

public class OUTReportFactory implements IReportFactory{
    @Override
    public AReport createAReport(String type, String name) {
        AReport report = null;
        switch (type) {
            case "INV":
                report = new OUTInvoiceReport(name);
                break;
            case "PUR":
                report = new OUTPurchaseReport(name);
                break;
            default:
                break;
        }
        return report;
    }
}
