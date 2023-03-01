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

public class SwitchingScenes extends Application {

    Button button;
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        Label label1 = new Label("Welcome to first scence");
        Button button1=new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));


        //layout vertical column
        VBox layout1= new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1= new Scene(layout1,200,200);

        ///button 2
        Button button2=new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));
        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Switching Scenes");
        window.show();





    }



}