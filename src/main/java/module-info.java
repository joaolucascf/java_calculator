module vaipo.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens vaipo.calculator to javafx.fxml;
    exports vaipo.calculator;
}