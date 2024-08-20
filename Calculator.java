
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    int result, operator;
    String displayValue, value1, value2, tempValue;
    Frame calculatorFrame;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button addButton, subtractButton, multiplyButton, divideButton, clearButton, equalsButton, decimalButton;
    Panel panel;
    TextField displayField;
    GridLayout grid;

    Calculator() {
        calculatorFrame = new Frame("Calculator");
        panel = new Panel();
        calculatorFrame.setLayout(new FlowLayout());
        button0 = new Button("0");
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");

        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        clearButton = new Button("C");
        equalsButton = new Button("=");
        decimalButton = new Button(".");
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        clearButton.addActionListener(this);
        equalsButton.addActionListener(this);
        decimalButton.addActionListener(this);
        displayField = new TextField(20);
        calculatorFrame.add(displayField);
        grid = new GridLayout(4, 4, 10, 20);
        panel.setLayout(grid);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(addButton);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(subtractButton);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(multiplyButton);
        panel.add(button0);
        panel.add(decimalButton);
        panel.add(clearButton);
        panel.add(equalsButton);
        panel.add(divideButton);
        calculatorFrame.add(panel);
        calculatorFrame.setSize(300, 300);
        calculatorFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            displayValue = displayField.getText();
            tempValue = "0";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button1) {
            displayValue = displayField.getText();
            tempValue = "1";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button2) {
            displayValue = displayField.getText();
            tempValue = "2";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button3) {
            displayValue = displayField.getText();
            tempValue = "3";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button4) {
            displayValue = displayField.getText();
            tempValue = "4";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button5) {
            displayValue = displayField.getText();
            tempValue = "5";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button6) {
            displayValue = displayField.getText();
            tempValue = "6";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button7) {
            displayValue = displayField.getText();
            tempValue = "7";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button8) {
            displayValue = displayField.getText();
            tempValue = "8";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == button9) {
            displayValue = displayField.getText();
            tempValue = "9";
            value2 = displayValue + tempValue;
            displayField.setText(value2);
        } else if (e.getSource() == addButton) {
            value1 = displayField.getText();
            displayField.setText("");
            operator = 1;
        } else if (e.getSource() == subtractButton) {
            value1 = displayField.getText();
            displayField.setText("");
            operator = 2;
        } else if (e.getSource() == multiplyButton) {
            value1 = displayField.getText();
            displayField.setText("");
            operator = 3;
        } else if (e.getSource() == divideButton) {
            value1 = displayField.getText();
            displayField.setText("");
            operator = 4;
        } else if (e.getSource() == clearButton) {
            displayField.setText("");
            operator = 0;
        } else if (e.getSource() == equalsButton) {
            value2 = displayField.getText();
            if (operator == 1) {
                result = Integer.parseInt(value1) + Integer.parseInt(value2);
                displayField.setText(String.valueOf(result));
            } else if (operator == 2) {
                result = Integer.parseInt(value1) - Integer.parseInt(value2);
                displayField.setText(String.valueOf(result));
            } else if (operator == 3) {
                result = Integer.parseInt(value1) * Integer.parseInt(value2);
                displayField.setText(String.valueOf(result));
            } else if (operator == 4) {
                try {
                    int tempResult = Integer.parseInt(value2);
                    if (tempResult != 0) {
                        result = Integer.parseInt(value1) / Integer.parseInt(value2);
                        displayField.setText(String.valueOf(result));
                    } else {
                        displayField.setText("Error");
                    }
                } catch (Exception ex) {
                    displayField.setText("Error");
                }
            }
        } else if (e.getSource() == decimalButton) {
            displayField.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
