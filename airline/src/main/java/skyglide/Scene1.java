package skyglide;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Scene1 implements Initializable{

    // Conteroller from Scene Builder for Starting Page 

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Logout;

    @FXML
    private Button Login;

    @FXML
    private Button Sign_in;

    @FXML
    private Button HomePage;

    @FXML
    private ImageView Small_AirPlane;

    @FXML
    private Label Title;

    @FXML
    private Label Small_Label;

    @FXML
    private Pane Small_Line;



    @FXML
    void Login(ActionEvent event) throws IOException {

         Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);

         stage.setTitle("Login");
         stage.setX(330);
         stage.setY(90);
         stage.setScene(scene);
         stage.show();


    }

    // Method for Accessing Sign In Page for the User
    @FXML
    void Sign_In(ActionEvent event) throws IOException{

         Parent root = FXMLLoader.load(getClass().getResource("Sign.fxml"));
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);

         stage.setTitle("Sign In");
         stage.setX(330);
         stage.setY(90);
         stage.setScene(scene);
         stage.show();

    }

    // Method For Asking the User if he needs to exit and Logout
    @FXML
    void Logout(ActionEvent event) {

        Stage Stage = (Stage) Logout.getScene().getWindow();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are You Sure to Exit ?");

        if (alert.showAndWait().get() == ButtonType.OK) { Stage.close(); }
            
    }

    @FXML
    void Home_Page(ActionEvent event) throws IOException {

         Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);

         stage.setTitle("Airlne App");
         stage.setX(200);
         stage.setY(5);
         stage.setScene(scene);
         stage.show();

    }


    @FXML
    void initialize() {
        assert Logout != null : "fx:id=\"Logout\" was not injected: check your FXML file 'Scene1.fxml'.";

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        
        TranslateTransition translate = new TranslateTransition();
        RotateTransition rotate = new RotateTransition();

        translate.setNode(Small_AirPlane);
        translate.setDuration(Duration.millis(2000));
        translate.setByX(160);
        translate.play();

        rotate.setNode(Small_AirPlane);
        rotate.setDuration(Duration.millis(1500));
        rotate.setByAngle(360);
        rotate.play();

        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Small_Label);
        translate1.setDuration(Duration.millis(1800));
        translate1.setByY(-135);
        translate1.play();

        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(Title);
        translate2.setDuration(Duration.millis(1500));
        translate2.setByX(240);
        translate2.play();

        TranslateTransition translate3 = new TranslateTransition();
        translate3.setNode(Small_Line);
        translate3.setDuration(Duration.millis(2000));
        translate3.setByX(300);
        translate3.play();



        

    }    
}
