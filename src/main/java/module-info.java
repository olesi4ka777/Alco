module com.example.alco {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.alco to javafx.fxml;
    exports com.example.alco;
}