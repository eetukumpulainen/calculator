package Laskin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
	
	// This class is a controller for gui.fxml
	
	private int first;
	private int second;
	private char operator;
	
	
	@FXML
	private Label screen;
	
	@FXML
	public void one() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "1");
	}
	
	@FXML
	public void two() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "2");
	}
	
	@FXML
	public void three() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "3");
	}
	
	@FXML
	public void four() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "4");
	}
	
	@FXML
	public void five() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "5");
	}
	
	@FXML
	public void six() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "6");
	}
	
	@FXML
	public void seven() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "7");
	}
	
	@FXML
	public void eight() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "8");
	}
	
	@FXML
	public void nine() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "9");
	}
	
	@FXML
	public void zero() {
		if (screen.getText() == "+" || screen.getText() == "-" || screen.getText() == "*" || screen.getText() == "/") {
			screen.setText("");
		}
		screen.setText(screen.getText() + "0");
	}
	
	@FXML
	public void plus() {
		first = Integer.parseInt(screen.getText());
		operator = '+';
		screen.setText("+");
	}
	
	@FXML
	public void minus() {
		first = Integer.parseInt(screen.getText());
		operator = '-';
		screen.setText("-");
	}
	
	@FXML
	public void multiply() {
		first = Integer.parseInt(screen.getText());
		operator = '*';
		screen.setText("*");
	}
	
	@FXML
	public void divide() {
		first = Integer.parseInt(screen.getText());
		operator = '/';
		screen.setText("/");
	}
	
	@FXML
	public void equals() {
		try {
			second = Integer.parseInt(screen.getText());
			double answer = calculate(first, second, operator);
			System.out.print(first);
			System.out.print(operator);
			System.out.print(second + "=");
			System.out.println(answer);
			screen.setText(Double.toString(answer));
		} catch (Exception e) {
			screen.setText("ERROR");
		}
	}
	
	private double calculate(int num1, int num2, char operator) {
		
		switch(operator) {
		case '+':
			return (num1 + num2);
		case '-':
			return (num1 - num2);
		case '*':
			return (num1 * num2);
		case '/':
			return (num1 / num2);
		default:
			return 0;
		}
	}

	@FXML
	public void clearScreen() {
		first=0;
		second=0;
		screen.setText("");
	}

}
