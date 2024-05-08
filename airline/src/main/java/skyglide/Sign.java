import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;


public class Sign implements Initializable{

   /*
    Controlling Variables Giving It's FX:ID
    Controller Class For Sign Page (Connected To FXML Files)
   */

    @FXML
    private TextField DateBirth_TextField;

    @FXML
    private Label Date_Birth;

    @FXML
    private TextField Email_Textfield;

    @FXML
    private PasswordField Password_Textfield;

    @FXML
    private TextField Username_Textfield;

    @FXML
    private Label SignIn;

    @FXML
    private Label Welcome;

    @FXML
    private Label Back;


     // Buttons For Interactiing With Users :

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



    @FXML
    void initialize() {
        
        assert Date_Birth != null : "fx:id=\"Date_Birth\" was not injected: check your FXML file 'Sign.fxml'.";
        assert Email_Textfield != null : "fx:id=\"Email_Textfield\" was not injected: check your FXML file 'Sign.fxml'.";
        assert Password_Textfield != null : "fx:id=\"Password_Textfield\" was not injected: check your FXML file 'Sign.fxml'.";
        assert Username_Textfield != null : "fx:id=\"Username_Textfield\" was not injected: check your FXML file 'Sign.fxml'.";

    }

    // Strating For Window open Action Animations :

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(Welcome);
        translate.setDuration(Duration.millis(1200));
        translate.setByX(200);
        translate.play();

        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Back);
        translate1.setDuration(Duration.millis(1800));
        translate1.setByX(145);
        translate1.play();

        TranslateTransition translate3 = new TranslateTransition();
        translate3.setNode(SignIn);
        translate3.setDuration(Duration.millis(1200));
        translate3.setByY(100);
        translate3.play();


    }


}
