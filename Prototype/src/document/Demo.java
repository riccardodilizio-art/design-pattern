package document;

public class Demo {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        Report baseReport = new Report("Report mensile", "Riccardo","Contenuto base");
        documentManager.registerPrototype("Mensile", baseReport);

        Report report1 = (Report) documentManager.getPrototype("Mensile");
        report1.setAuthor("Graziano");
        report1.setContent("Contenuto basilare");

        Report report2 = (Report) documentManager.getPrototype("Mensile");
        report2.setAuthor("Giulia");
        report2.setContent("Contenuto mensile");

        System.out.println(report1);
        System.out.println(report2);
        System.out.println("Prototipo di base "+ baseReport);
    }
}
