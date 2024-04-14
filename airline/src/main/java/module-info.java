module skyglide {
    requires javafx.controls;
    requires javafx.fxml;

    opens skyglide to javafx.fxml;
    exports skyglide;
}
