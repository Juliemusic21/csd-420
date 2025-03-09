module com.example.module8assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.module8assignment to javafx.fxml;
    exports com.example.module8assignment;
}