module com.example.injecaodependecias {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.cdi;


    opens com.example.injecaodependecias to javafx.fxml;
    exports com.example.injecaodependecias;
}