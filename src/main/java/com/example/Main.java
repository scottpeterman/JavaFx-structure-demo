package com.example;

import com.example.common.Util;
import com.example.view.RootView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        if (!(Util.isWindows() || Util.isMac())) { //Load Arial font for all *nix platforms
            Font.loadFont(getClass().getClassLoader().getResource("Arial.ttf").toExternalForm(), 12);
        }

        RootView rootView = new RootView();
        Pane root = rootView.getView();
        Scene scene = new Scene(root, Util.APP_WIDTH, Util.APP_HEIGHT);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("app.css").toExternalForm());
        stage.setTitle(Util.TITLE);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
