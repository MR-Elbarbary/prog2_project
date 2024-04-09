module airline {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens airline to javafx.fxml;
    exports airline;
}
