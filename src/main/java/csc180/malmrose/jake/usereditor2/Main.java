/**
 * @author Jmalmrose
 * @createdOn 8/14/2023 at 2:01 PM
 * @projectName UserEditor2
 * @packageName csc180.malmrose.jake.usereditor2;
 */
package csc180.malmrose.jake.usereditor2;

import javafx.application.Application;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception {
        SceneController.ChangeScene(primaryStage, "Login.fxml");
    }
}
