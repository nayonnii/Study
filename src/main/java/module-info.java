module com.example.study {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.study to javafx.fxml;
    exports com.example.study;
}