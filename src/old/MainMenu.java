//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class MainMenu {
//    static public Scene scene;
//    static public void create(Stage stage) {
//        //objects creations
//        Label menuT = new Label("Cube Adventure 2: Cubical Hunt");
//        Button soloB = new Button("Versus bot");
//        Button hostB = new Button("Create lobby");
//        Button joinB = new Button("Join into lobby");
//
//        //objects realization
//        menuT.setFont(new Font(40));
//        menuT.setStyle("-fx-text-fill: #ffffff");
//
//        soloB.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                Main.status = 10;
//                Main.sceneSwitcher(stage);
//            }
//        });
//        soloB.setPrefSize(150, 50);
//        soloB.setFont(new Font(20));
//        soloB.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #ff0000");
//
//        hostB.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                /*
//                soloB.setDisable(true);
//                hostB.setDisable(true);
//                joinB.setDisable(true);
//                Main.status = 20;
//                Main.sceneSwitcher(stage);
//                */
//                hostB.setDisable(true);
//            }
//        });
//        hostB.setPrefSize(150, 50);
//        hostB.setFont(new Font(20));
//        hostB.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #800080");
//
//        joinB.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                /*
//                soloB.setDisable(true);
//                hostB.setDisable(true);
//                joinB.setDisable(true);
//                Main.status = 30;
//                Main.sceneSwitcher(stage);
//                */
//                joinB.setDisable(true);
//            }
//        });
//        joinB.setPrefSize(150, 50);
//        joinB.setFont(new Font(17));
//        joinB.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #00ff00");
//
//        //scene creation
//        VBox menu = new VBox(menuT, soloB, hostB, joinB);
//        menu.setAlignment(Pos.TOP_CENTER);
//        menu.setSpacing(30);
//        menu.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
//        scene = new Scene(menu);
//    }
//}
