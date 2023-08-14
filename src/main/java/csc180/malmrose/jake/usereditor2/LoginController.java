/**
 * @author Jmalmrose
 * @createdOn 8/14/2023 at 2:00 PM
 * @projectName UserEditor2
 * @packageName csc180.malmrose.jake.usereditor2;
 */
package csc180.malmrose.jake.usereditor2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    @FXML
    private void btnLoginClick() throws Exception {
        // get user and pass from fields
        String strUsername = txtUsername.getText();
        String strPassword = txtPassword.getText();
        // check against database

    }
}
