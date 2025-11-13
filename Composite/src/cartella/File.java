package cartella;

public class File implements FileSystemComponent {
    public String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File " +this.name);
    }
}
