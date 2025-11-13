package cartella;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("documento.txt");
        File file2 = new File("foto.jpg");
        File file3 = new File("presentazione.txt");

        Folder folder1 = new Folder("Documenti");
        Folder folder2 = new Folder("Foto");

        folder1.addChild(file1);
        folder1.addChild(file3);
        folder2.addChild(file2);

        Folder root = new Folder("Root");
        root.addChild(folder1);
        root.addChild(folder2);

        root.showDetails();
    }
}
