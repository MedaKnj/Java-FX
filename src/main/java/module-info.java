module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example to javafx.fxml;
    exports org.example;
    opens org.example.model to javafx.base;
    exports org.example.controller;
    opens org.example.controller to javafx.fxml;

}
