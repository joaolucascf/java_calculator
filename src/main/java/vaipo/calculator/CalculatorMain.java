package vaipo.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(CalculatorMain.class.getResource("calculatorDisplay.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), stage.getWidth(), stage.getHeight());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}