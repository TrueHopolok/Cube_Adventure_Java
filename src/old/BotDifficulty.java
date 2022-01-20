//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//
//public class BotDifficulty {
//    static public Scene scene;
//    static public void create(Stage stage) {
//        old.Info.botDifficulty = "normal";
//
//        //objects creating
//        Label infoT = new Label("Select bot difficulty:");
//        ToggleGroup tg = new ToggleGroup();
//        RadioButton nightmareB = new RadioButton("nightmare");
//        RadioButton hardB = new RadioButton("hard");
//        RadioButton normalB = new RadioButton("normal");
//        RadioButton easyB = new RadioButton("easy");
//        nightmareB.setToggleGroup(tg);
//        hardB.setToggleGroup(tg);
//        normalB.setToggleGroup(tg);
//        easyB.setToggleGroup(tg);
//        Button doneB = new Button("Select!");
//        Button exitB = new Button(">Exit<");
//
//        //objects realization
//        infoT.setFont(new Font(30));
//        infoT.setStyle("-fx-text-fill: #ffffff");
//
//        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
//            public void changed(ObservableValue<? extends Toggle> changed, Toggle oldValue, Toggle newValue){
//                old.Info.botDifficulty = ((RadioButton) newValue).getText();
//            }
//        });
//
//        //hunterB.setPrefSize(150, 50);
//        nightmareB.setFont(new Font(15));
//        nightmareB.setStyle("-fx-text-fill: #ffffff");
//        hardB.setFont(new Font(15));
//        hardB.setStyle("-fx-text-fill: #ffffff");
//        normalB.setFont(new Font(15));
//        normalB.setStyle("-fx-text-fill: #ffffff");
//        easyB.setFont(new Font(15));
//        easyB.setStyle("-fx-text-fill: #ffffff");
//
//        doneB.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                Main.status = 12;
//                Main.sceneSwitcher(stage);
//            }
//        });
//        doneB.setFont(new Font(15));
//        doneB.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #ff0000");
//
//        exitB.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Main.status = 0;
//                Main.sceneSwitcher(stage);
//            }
//        });
//        exitB.setFont(new Font(15));
//        exitB.setStyle("-fx-background-color: #0000ff; -fx-text-fill: #00ff00");
//
//        //scene creation
//        VBox selector = new VBox(nightmareB, hardB, normalB, easyB, doneB);
//        selector.setSpacing(10);
//        selector.setAlignment(Pos.CENTER);
//        StackPane mainGroup = new StackPane(infoT, selector, exitB);
//        mainGroup.setAlignment(infoT, Pos.TOP_LEFT);
//        mainGroup.setAlignment(selector, Pos.CENTER);
//        mainGroup.setAlignment(exitB, Pos.BOTTOM_LEFT);
//        mainGroup.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
//        scene = new Scene(mainGroup);
//    }
//}
