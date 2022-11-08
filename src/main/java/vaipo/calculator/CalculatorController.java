package vaipo.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;

public class CalculatorController {
    private String resultTemp;
    private double firstOperator = 0;
    private double doubleOperator = 0;
    private double resultNumber = 0;
    private byte bufferOp = -1;
    @FXML
    private TextField resultField;
    @FXML
    private Button btnZero;
    @FXML
    private Button btnOne;
    @FXML
    private Button btnTwo;
    @FXML
    private Button btnThree;
    @FXML
    private Button btnFour;
    @FXML
    private Button btnFive;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnSeven;
    @FXML
    private Button btnEight;
    @FXML
    private Button btnNine;
    @FXML
    private Button btnSlash;
    @FXML
    private Button btnStar;
    @FXML
    private Button btnSum;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btnEquals;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnDot;
    public void btnZeroPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"0";
        resultField.setText(resultTemp);
    }
    public void btnOnePress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"1";
        resultField.setText(resultTemp);
    }
    public void btnTwoPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"2";
        resultField.setText(resultTemp);
    }
    public void btnThreePress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"3";
        resultField.setText(resultTemp);
    }
    public void btnFourPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"4";
        resultField.setText(resultTemp);
    }
    public void btnFivePress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"5";
        resultField.setText(resultTemp);
    }
    public void btnSixPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"6";
        resultField.setText(resultTemp);
    }
    public void btnSevenPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"7";
        resultField.setText(resultTemp);
    }
    public void btnEightPress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"8";
        resultField.setText(resultTemp);
    }
    public void btnNinePress(){
        if(bufferOp==0){
            btnClearPress();
            bufferOp = -1;
        }
        resultTemp = resultField.getText()+"9";
        resultField.setText(resultTemp);
    }
    public void btnDotPress(){
        if(resultField.getText().isEmpty()){
            resultTemp = resultField.getText()+"0.";
        }else {
            resultTemp = resultField.getText() + ".";
        }
        resultField.setText(resultTemp);
    }
    public void btnClearPress(){
        firstOperator = 0;
        doubleOperator = 0;
        resultNumber = 0;
        bufferOp = 0;
        resultField.setText("");
    }
    public void btnSumPress(){
        if(resultField.getText().isEmpty()){
            firstOperator = 0;
        } else {
            firstOperator = Double.parseDouble(resultField.getText());
        }
        resultField.setText("");
        bufferOp = '+';
    }
    public void btnMinusPress(){
        if(resultField.getText().isEmpty()){
            firstOperator = 0;
        } else {
            firstOperator = Double.parseDouble(resultField.getText());
        }
        resultField.setText("");
        bufferOp = '-';
    }
    public void btnSlashPress(){
        if(resultField.getText().isEmpty()){
            firstOperator = 0;
        } else {
            firstOperator = Double.parseDouble(resultField.getText());
        }
        resultField.setText("");
        bufferOp = '/';
    }
    public void btnStarPress(){
        if(resultField.getText().isEmpty()){
            firstOperator = 0;
        } else {
            firstOperator = Double.parseDouble(resultField.getText());
        }
        resultField.setText("");
        bufferOp = '*';
    }
    public void btnEqualsPress(){
        if(resultField.getText().isEmpty()) {
            return;
        }else{
            doubleOperator = Double.parseDouble(resultField.getText());
            switch (bufferOp) {
                case '+' -> resultNumber = firstOperator + doubleOperator;
                case '-' -> resultNumber = firstOperator - doubleOperator;
                case '/' -> resultNumber = firstOperator / doubleOperator;
                case '*' -> resultNumber = firstOperator * doubleOperator;
                default -> {return;}
            }
            formatOutputText();
        }
    }
    public void formatOutputText(){
        String integerPart = String.valueOf(resultNumber);
        String[] splitter;
        splitter = integerPart.split("\\.");
        try {
            if (Integer.parseInt(splitter[1]) == 0) {
                resultField.setText(splitter[0]);
            } else {
                resultField.setText(splitter[0] + "." + splitter[1]);
            }
        }
        catch (NumberFormatException e){
            resultField.setText(splitter[0] + "." +splitter[1].substring(0,10-splitter[0].length())+"...");
        }
        bufferOp = 0;  //NULL
    }
}
