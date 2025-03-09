module com.example.module2db {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module2db to javafx.fxml;
    exports com.example.module2db;
}