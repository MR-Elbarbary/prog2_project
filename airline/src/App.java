import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image icon = new Image(getClass().getResourceAsStream("icon.jpeg"));
        stage.getIcons().add(icon);
        Group root = new Group();
        Scene scene = new Scene(root, Color.AQUA);
        stage.setScene(scene);
        stage.setTitle("Airline");
        stage.show();
    }
}
