//Group 14 Names: Archer James, Temo Galindo, Long Nguyen, Georgia Watkins, Dylan Moorefield

package org.example.pilatesworkoutplan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WorkoutPlanner extends Application {
    //Initialize Stage
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PilatesDraft3.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("PilatesDraft3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}