package com.soft1841.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstJavaFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("第一个JavaFx应用");
        Button button = new Button("按钮");
        Scene scene = new Scene(button,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

