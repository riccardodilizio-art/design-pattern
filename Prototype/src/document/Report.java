package document;

public class Report implements  DocumentPrototype {
    private String title;
    private String author;
    private String content;

    public Report(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Report() {}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new Report(this.title, this.author, this.content);
    }
    @Override
    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", Content: " + this.content;
    }
}
