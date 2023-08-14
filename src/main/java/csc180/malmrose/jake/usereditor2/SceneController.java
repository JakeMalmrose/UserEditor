/**
 * @author Jmalmrose
 * @createdOn 8/14/2023 at 1:36 PM
 * @projectName UserEditor2
 * @packageName csc180.malmrose.jake.usereditor2;
 */
package csc180.malmrose.jake.usereditor2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private static Scene scene;

    public static void ChangeScene(Stage stage, String strFXMLFileName) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(SceneController.class.getResource(strFXMLFileName));
        scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
