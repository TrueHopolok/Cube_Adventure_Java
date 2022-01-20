import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        sceneSwitcher(primaryStage);
        primaryStage.show();
    }
    public static int status = 0;
    public static void sceneSwitcher(Stage stage) throws IOException {
        switch (status) {
            case 0 :
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(new URL("file:///D:/JAVA projects/FX_test/gui/MainMenu.fxml"));
                stage.setScene(new Scene(new Pane(loader.<Pane>load())));
            //case 10 -> stage.setScene(BotSelector.scene);
            //case 11 -> stage.setScene(BotDifficulty.scene);
            //case 12 -> stage.setScene(old.BotGameplay.scene);
        }
    }
}
