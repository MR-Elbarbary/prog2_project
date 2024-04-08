module airline {
    requires javafx.controls;
    requires javafx.fxml;

    opens airline to javafx.fxml;
    exports airline;
}
