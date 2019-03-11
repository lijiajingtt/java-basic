package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HuoYingJiang<scene, gridPane> extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取当前屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width + "  " +screenSize.height);
        primaryStage.setTitle("王者荣耀");
        //创建一个边界布局，上下左右中
        BorderPane borderPane = new BorderPane();
        //给外层的边界布局设置背景图
        BackgroundImage bg = new BackgroundImage(
                new Image("img/bg.jpg",
                        screenSize.width,
                        screenSize.height,
                        false,
                        true),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        //背景图设置给边界布局
        borderPane.setBackground(new Background(bg));
        //创建一个水平布局
        HBox hBox = new HBox();
        //设置水平布局中间的各个组件之间的间距
        hBox.setSpacing(20);
        //设置水平布局和窗体之间的间距
        hBox.setPadding(new Insets(20, 20, 20, 20));
        //创建一个网格布局
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10.);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 50));
        //创建一个按钮名称的字符串数组
        String[] buttonNames = {
                "仲夏夜之梦", "貂蝉", "绯红之刃", "露娜", "花木兰", "大乔-伊势巫女"
        };
        //开始循环，创建若干按钮，并且设置样式，添加到水平布局中
        for (int i = 0; i < buttonNames.length; i++) {
            //循环创建按钮，并将buttonNames数组中的元素作为按钮文字
            Button button = new Button(buttonNames[i]);
            //给按钮设置样式
            button.setStyle("-fx-background-color: #BC43B0;" + "-fx-min-width:80px;-fx-max-height: 35px ");
            //把按钮加入水平布局
            hBox.getChildren().add(button);
        }
        //水平布局增加设置按钮，黑底白字
        Button setBtn = new Button("设置");
        setBtn.setStyle("-fx-background-color:#3FAFBC;" + "-fx-text-fill:#B8D8E7;"
                + "-fx-max-width: 120px;" + "-fx-min-width: 80px");
        hBox.getChildren().add(setBtn);
        setBtn.setOnAction(event -> {
            //创建新的舞台窗口
            Stage secondStage = new Stage();
            //创建一个水平布局
            HBox hBox1 = new HBox();
            hBox1.setSpacing(20);
            hBox1.setPadding(new Insets(
                    0,50,50,0));
            Image image1 = new Image("img/7.jpg");
            ImageView imageView1 = new ImageView(image1);
            imageView1.setFitHeight(300);
            imageView1.setFitWidth(400);
            //把图片加入水平布局
            hBox1.getChildren().add(imageView1);
            Label label = new Label("现在这些我都有了，却忘了爱一个人是什么感觉");
            label.setStyle("-fx-text-fill: #96C043;" + "-fx-font-size: 30px;");
            secondStage.setTitle("只是我好想你");
            //把标题加入水平布局
            hBox1.getChildren().add(label);
            Scene secondScene = new Scene(hBox1, 400, 300);
            secondStage.setScene(secondScene);
            secondStage.show();
        });
        //加入一个日期
        DatePicker datePicker = new DatePicker();
        hBox.getChildren().add(datePicker);
        //将水平布局对象加入边界布局的顶部
        borderPane.setTop(hBox);
        //开始处理网格布局的行和列
        int count = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Image image = new Image("img/" + count + ".jpg");
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(300);
                imageView.setFitHeight(200);
                gridPane.add(imageView, j, i);
                count++;
            }
        }
        //将网格布局加入边界布局的中间
        borderPane.setCenter(gridPane);

        //创建场景，并将边界布局加入场景
        Scene scene = new Scene(borderPane, 800, 500);
        //将场景加入当前的舞台
        primaryStage.setScene(scene);
        //设置舞台可见
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}











