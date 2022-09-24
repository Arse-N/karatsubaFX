package com.example.karatsubfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {

    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Karatsuba Algorithm!");
//        stage.setScene(scene);
//        stage.show();

        window = stage;
        window.setTitle("Karatsuba Algorithm");
//        TextField input1 = new TextField();
//        TextField input2 = new TextField();

        button = new Button("Calculate");
//        button.setOnAction(e -> System.out.println(input1.getText()+" "+ input2.getText()));

//        VBox layout = new VBox(10);
        scene = new Scene(fxmlLoader.load(),450,300);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}