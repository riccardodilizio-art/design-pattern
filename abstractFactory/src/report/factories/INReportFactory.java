package report.factories;

import report.AReport;
import report.input.INInvoiceReport;
import report.input.INPurchaseReport;

public class INReportFactory implements IReportFactory {

    @Override
    public AReport createAReport(String type, String name) {
        AReport report = null;
        switch (type) {
            case "INV":
                report = new INInvoiceReport(name);
                break;
            case "PUR":
                report = new INPurchaseReport(name);
                break;
                default:
                    break;
        }
        return report;
    }
}
