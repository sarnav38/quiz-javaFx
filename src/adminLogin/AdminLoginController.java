package adminLogin;

import constants.Db;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AdminLoginController {
    public Button adminLoginButton;
    public PasswordField adminPassword;
    public TextField adminEmail;
    public TextField studentEmail;
    public PasswordField studentPassword1;
    public Button studentLoginButton1;

    public void adminLogin() throws IOException, SQLException, ClassNotFoundException {
        String admin_email =adminEmail.getText();
        String admin_pass = adminPassword.getText();
        Db db = new Db();

        if(db.check(admin_email,admin_pass)){
//            System.out.println("Login Sucessfull");
            Parent node = FXMLLoader.load(getClass().getResource("/fxml/AdminHomeScreenFXML.fxml"));
            Stage stage = (Stage) adminEmail.getScene().getWindow();
            Scene scene = new Scene(node);
            stage.setScene(scene);
            stage.setMaximized(true);
        }
        else{
            System.out.println("Login Failed");

        }
    }

    public void studentLogin() {
        System.out.println("student login");
    }
}
