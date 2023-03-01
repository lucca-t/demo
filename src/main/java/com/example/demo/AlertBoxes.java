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

public class AlertBoxes extends Application {

    Button button;
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Alert Boxes");

        button = new Button("Click Me");




    }



}