package com.example.demo;

import javafx.application.Application;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Button button;

    public static void main(String[] args) {
    launch();
}
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane layout = new StackPane();
        button =new Button("test");
        button.setOnAction(e -> System.out.println("balls"));
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();




    }



}