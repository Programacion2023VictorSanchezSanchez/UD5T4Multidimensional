package com.iesochoa.victorsanchez.ud5t4multidimensional;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VentasApplication extends Application {

    @Override
    public void start(Stage Stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentasApplication.class.getResource("ventas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage.setTitle("Ventas Semanales");
        Stage.setScene(scene);
        Stage.show();

    }
}
