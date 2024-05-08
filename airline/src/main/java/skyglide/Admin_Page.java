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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;

public class Admin_Page implements Initializable{

    /*
    Controlling Variables Giving It's FX:ID
    Controller Class For Admin Page (Connected To FXML Files)
    */

    @FXML
    private Button Add_Members;

    @FXML
    private Button Back;

    @FXML
    private Button Check_Aircrafts;

    @FXML
    private Button Check_Data;

    @FXML
    private Button Checking_Flights;

    @FXML
    private Label Labe1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Pane Left_Pane;

    @FXML
    private Pane Mini_Pane;

    @FXML
    private Pane Move_pane_Scene;

    @FXML
    private Pane Move_pane_Scene1;

    @FXML
    private Pane Pane5;

    @FXML
    private Pane Pane6;

    @FXML
    private Pane Pane7;

    @FXML
    private Pane Pane8;

    @FXML
    private Pane Pane9;

    @FXML
    private Button Remove_Member;

    @FXML
    private Pane Small_Pane;

    @FXML
    private Pane Underline;

    // Buttons For Interactiing With Users :

    @FXML
    void Back_Previous_Page(ActionEvent event) throws IOException {

         Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);
         
         stage.setTitle("SkyGlide");
         stage.setX(290);
         stage.setY(130);
         stage.setScene(scene);
         stage.show();


    }

     // Strating For Window open Action Animations :

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(Labe1);
        translate.setDuration(Duration.millis(1100));
        translate.setByY(90);
        translate.play();
        
        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Underline);
        translate1.setDuration(Duration.millis(1200));
        translate1.setByX(530);
        translate1.play();        


        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(Left_Pane);
        translate2.setDuration(Duration.millis(1200));
        translate2.setByX(180);
        translate2.play();
        
        TranslateTransition translate3 = new TranslateTransition();
        translate3.setNode(Label2);
        translate3.setDuration(Duration.millis(1500));
        translate3.setByX(210);
        translate3.play();
        
        TranslateTransition translate4 = new TranslateTransition();
        translate4.setNode(Label3);
        translate4.setDuration(Duration.millis(1600));
        translate4.setByX(220);
        translate4.play();       

        TranslateTransition translate5 = new TranslateTransition();
        translate5.setNode(Small_Pane);
        translate5.setDuration(Duration.millis(1600));
        translate5.setByX(230);
        translate5.play();       

        TranslateTransition translate6 = new TranslateTransition();
        translate6.setNode(Pane5);
        translate6.setDuration(Duration.millis(1600));
        translate6.setByY(85);
        translate6.play();       

        
        TranslateTransition translate7 = new TranslateTransition();
        translate7.setNode(Mini_Pane);
        translate7.setDuration(Duration.millis(1600));
        translate7.setByX(250);
        translate7.play();       

        TranslateTransition translate8 = new TranslateTransition();
        translate8.setNode(Move_pane_Scene);
        translate8.setDuration(Duration.millis(1200));
        translate8.setByX(-765);
        translate8.play();       

        TranslateTransition translate9 = new TranslateTransition();
        translate9.setNode(Move_pane_Scene1);
        translate9.setDuration(Duration.millis(1200));
        translate9.setByY(-500);
        translate9.play();




    }

}
