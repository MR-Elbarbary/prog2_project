import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class SkyGlide extends Application{
public static void main(String [] args) {
        
    launch(args);

    }

@Override
public void start(Stage stage) throws Exception {

    try {

        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);
        
        // For Designs and Connection Between Scenes and Css Files

        String css = this.getClass().getResource("Scene1.css").toExternalForm();
        scene.getStylesheets().add(css);


        Image icon = new Image("\\Projects Images\\Screenshot (219).png");
        stage.getIcons().add(icon);

        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.setTitle("Airlne App");
        stage.setX(350);
        stage.setY(130);
        stage.setScene(scene);
        stage.show();

    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}