package report;

import report.factories.INReportFactory;
import report.factories.IReportFactory;
import report.factories.OUTReportFactory;

public class FactoryProvider {

    public static IReportFactory getFactory(String type) {
        IReportFactory factory = null;
        switch (type){
            case "IN":
                factory = new INReportFactory();
                break;
            case "OUT":
                factory = new OUTReportFactory();
                break;
                default:
                    break;
        }
        return factory;
    }
}
