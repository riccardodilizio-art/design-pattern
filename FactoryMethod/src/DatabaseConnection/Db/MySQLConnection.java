package DatabaseConnection.Db;

public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
