module skyglide {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens skyglide to javafx.fxml;
    exports skyglide;
}
