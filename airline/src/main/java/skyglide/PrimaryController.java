package skyglide;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void register() throws IOException {
        App.setRoot("register");
    }

    @FXML
    private void login() {
        System.out.println("hello");
    }
}