package tech.ugma.education.wmp0;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * To test the webstart maven plugin; attempt 0
 */
public class Main extends Application {


    /**
     * The path to the fxml file that makes up the GUI; path is relative to the project structure.
     */
    private static final String FXML_PATH = "layout.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Main.class.getResource(FXML_PATH));

        //Load view
        Parent view = fxmlLoader.load();

        //Put the view in a scene
        Scene scene = new Scene(view);
        primaryStage.setTitle("wmp0");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
