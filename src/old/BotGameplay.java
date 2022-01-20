package old;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BotGameplay {
    static public Scene scene;
    static public void create(Stage stage) {
        scene = new Scene(new Group(new Label("gameplay")));
    }
}
