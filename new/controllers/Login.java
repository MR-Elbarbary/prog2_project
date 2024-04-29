package skyglide;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class Login {

    @FXML
    private Button Back;

    @FXML
    private PasswordField Password;

    @FXML
    void Return_Back_Previous_Page(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setX(350);
        stage.setY(130);
        stage.show();

    }
    
}
