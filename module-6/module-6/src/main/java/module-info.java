module com.example.module6programmingassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module6programmingassignment to javafx.fxml;
    exports com.example.module6programmingassignment;
}