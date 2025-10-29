package DatabaseConnection.factory;

import DatabaseConnection.Db.DatabaseConnection;
import DatabaseConnection.Db.MySQLConnection;
import DatabaseConnection.Db.PostgreSQLConnection;

public abstract class DatabaseConnectionFactory {
    public static DatabaseConnection getDatabaseConnection(String type) {
        switch (type){
            case "MySQL":
                return new MySQLConnection();
                break;
            case "PostgreSQL":
                return new PostgreSQLConnection();
                break;
                default:
                    System.err.println("Unknown database type: " + type);

        }


    }
}
