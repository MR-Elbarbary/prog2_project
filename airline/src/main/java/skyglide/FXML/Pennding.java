package skyglide.FXML;

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

public class Pennding implements Initializable{


    @FXML
    private Button Back;

    @FXML
    private Label Airline_Label;

    @FXML
    private Label Help;

    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Label Label4;

    @FXML
    private Label Label5;

    @FXML
    private Pane Left_Pane;

    @FXML
    private Label Selecting_Country;

    @FXML
    private Pane Small_Pane;

    @FXML
    private Pane Small_Pane1;

    @FXML
    private Pane Upper_Pane;

    @FXML
    void Back(ActionEvent event) throws IOException {

         Parent root = FXMLLoader.load(getClass().getResource("\\FXML\\HomePage.fxml"));
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         Scene scene = new Scene(root);
         
         stage.setTitle("Airlne App");
         stage.setX(200);
         stage.setY(5);
         stage.setScene(scene);
         stage.show();

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

         
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(Left_Pane);
        translate.setDuration(Duration.millis(1000));
        translate.setByX(180);
        translate.play();        

        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Help);
        translate1.setDuration(Duration.millis(1300));
        translate1.setByX(230);
        translate1.play();       
        
        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(Label1);
        translate2.setDuration(Duration.millis(1400));
        translate2.setByX(210);
        translate2.play();     

        TranslateTransition translate3 = new TranslateTransition();
        translate3.setNode(Label2);
        translate3.setDuration(Duration.millis(1600));
        translate3.setByX(210);
        translate3.play();     

        TranslateTransition translate4 = new TranslateTransition();
        translate4.setNode(Label3);
        translate4.setDuration(Duration.millis(1800));
        translate4.setByX(210);
        translate4.play();     

        TranslateTransition translate5 = new TranslateTransition();
        translate5.setNode(Label4);
        translate5.setDuration(Duration.millis(1700));
        translate5.setByX(220);
        translate5.play();     
    }

}
