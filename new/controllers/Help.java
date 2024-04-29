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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Help implements Initializable {

    @FXML
    private Button Back;

    @FXML
    private Label First_Label;

    @FXML
    private Label Seconed_Label;

    @FXML
    private Label Third_Label;




    @FXML
    void Return_Back_Previous_Page(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
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
        translate.setNode(First_Label);
        translate.setDuration(Duration.millis(1300));
        translate.setByX(560);
        translate.play();

        TranslateTransition translate1 = new TranslateTransition();
        translate1.setNode(Seconed_Label);
        translate1.setDuration(Duration.millis(1500));
        translate1.setByX(570);
        translate1.play();

        
        TranslateTransition translate3 = new TranslateTransition();
        translate3.setNode(Third_Label);
        translate3.setDuration(Duration.millis(1600));
        translate3.setByX(430);
        translate3.play();




    }

}
