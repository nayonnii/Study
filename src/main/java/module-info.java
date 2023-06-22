module com.example.study {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.study to javafx.fxml;
    exports com.example.study;
}