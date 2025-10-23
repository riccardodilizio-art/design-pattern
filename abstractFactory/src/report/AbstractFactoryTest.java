package report;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        String [] reports = {
                "IN_INV_001.txt",
                "OUT_PUR_001.txt",
                "IN_INV_002.txt",
                "IN_PUR_001.txt",
                "OUT_PUR_002.txt",
                "OUT_INV_001.txt",
                "IN_INV_003.txt"
        };

        Archive a = new Archive();

        for (String s : reports) {
            String[] parts = s.split("_");

            if (parts.length < 2) {
                System.err.println("Formato non valido per il file: " + s);
                continue;
            }

            String reportType = parts[0];
            String reportCategory = parts[1];

            a.addReport(reportType,reportCategory,s);
        }

        a.processAllReports();
    }
}
