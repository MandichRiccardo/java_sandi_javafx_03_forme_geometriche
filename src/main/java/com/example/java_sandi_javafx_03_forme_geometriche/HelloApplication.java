package com.example.java_sandi_javafx_03_forme_geometriche;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("forme geometriche");
        stage.setScene(scene);
        Rectangle r1 = new Rectangle(300, 50);
        r1.setFill(Color.rgb(0, 0, 255, 1));

        Group g = new Group();
        g.getChildren().add(r1);

        Scene s1 = new Scene(g);

        stage.setScene(s1);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}