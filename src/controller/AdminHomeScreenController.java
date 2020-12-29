package controller;

import com.jfoenix.controls.JFXTabPane;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminHomeScreenController implements Initializable {
    public JFXTabPane adminHomeTabPane;
    public Tab addQuiz;
    public Tab addStudent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Parent node = FXMLLoader.load(getClass().getResource("/fxml/AddQuizFXML.fxml"));
            addQuiz.setContent(node);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
