package report;

import report.factories.IReportFactory;

import java.util.ArrayList;
import java.util.List;

public class Archive {

    private List<AReport> reportList;

    public void addReport(String report, String type, String name) {
        IReportFactory reportFactory = FactoryProvider.getFactory(report);
        if (this.reportList == null) {
            this.reportList = new ArrayList<>();
        }
        this.reportList.add(reportFactory.createAReport(type, name));
    }

    public void processAllReports() {

        for (AReport i : this.reportList){
            i.processReport();
            System.out.println("------");
        }
    }
}
