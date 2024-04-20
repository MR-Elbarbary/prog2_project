package skyglide;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;

public class HomePage implements Initializable {

    // Conteroller from Scene Builder for HomePage 

    @FXML
    private Button Back;

    @FXML
    private Button Dashboard;

    @FXML
    private Button Help;

    @FXML
    private Button Report;

    @FXML
    private Button Sign_In;

    @FXML
    private Button Login;

    @FXML
    private Button Logout;

    @FXML
    private Button Profile;

    @FXML
    private Pane Left_Pane;

    @FXML
    private Pane Moving_Pane;


    @FXML
    void Return_Back_Previous_Page(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setX(290);
        stage.setY(130);
        stage.show();

    }

    @FXML
    void Switch_Dashboard(ActionEvent event) throws IOException {

    }

    // For Helping User Giving an Info about our App :
    @FXML
    void Switch_Help(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Help.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Help !");
        stage.setX(330);
        stage.setY(90);
        stage.setScene(scene);
        stage.show();

    
    }

    @FXML
    void Switch_Sign_In(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Sign.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Sign In");
        stage.setX(330);
        stage.setY(90);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void Switch_Login(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);

        stage.setTitle("Login");
        stage.setX(330);
        stage.setY(90);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void Switch_Report(ActionEvent event) {

    }

    @FXML
    void Logout(ActionEvent event) {

        Stage Stage = (Stage) Logout.getScene().getWindow();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are You Sure to Exit ?");

        if (alert.showAndWait().get() == ButtonType.OK) { Stage.close(); }
            

    }

    @FXML
    void Switch_Profile(ActionEvent event) {

    }

    


    // Strating For Window open Action Animations :

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(Moving_Pane);
        translate.setDuration(Duration.millis(1500));
        translate.setByX(-140);
        translate.play();
    
        
        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Left_Pane);
        translate1.setDuration(Duration.millis(1000));
        translate1.setByX(180);
        translate1.play();        

    }

}


