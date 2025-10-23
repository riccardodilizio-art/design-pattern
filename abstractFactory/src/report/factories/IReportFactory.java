package report.factories;

import report.AReport;

public interface IReportFactory {
    AReport createAReport(String type, String name);
}
