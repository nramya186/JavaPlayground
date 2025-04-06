package org.section30.design_pattern.creation.singleton;

class DatabaseCon {
    private static DatabaseCon instance;

    private DatabaseCon() {
        System.out.println("DataBase Connection Established");
    }
    public static DatabaseCon getInstance() {
        if (instance == null) {
            instance = new DatabaseCon();
        }
        return instance;
    }
    public void executeQuery(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

public class DatabaseCon_Singleton {
    public static void main(String[] args) {
        // Get the single instance of DatabaseConnection
        DatabaseCon db1 = DatabaseCon.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseCon db2 = DatabaseCon.getInstance();
        db2.executeQuery("SELECT FROm orders");
        // Check if both instances are the same

        System.out.println(db1 == db2);
        // Output: true (Both are same instance)
    }
}
