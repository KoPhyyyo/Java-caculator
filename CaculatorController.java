package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class CaculatorController{
	@FXML TextField textfield;
	double num1;
	double num2;
	double result;
	String op;
	

	@FXML public void Numbers(ActionEvent event){
		String first=textfield.getText();
		String Second=((Button)event.getSource()).getText();
		textfield.setText(first+Second);
	}
	@FXML public void Operator(ActionEvent event){
		 num1=Double.parseDouble(textfield.getText());
		op=((Button)event.getSource()).getText();
		textfield.setText("");
	}
	
	@FXML public void Equal(ActionEvent event){
		num2=Double.parseDouble(textfield.getText());
		switch(op){
		case"+":{result=num1 + num2;break;}
		case"-":{result=num1 - num2;break;}
		case"X":{result=num1 * num2;break;}
		case"/": {
			if (num2==0)
				result=0;
			else
				result=num1 / num2;break;}
		case"%":{if (num2==0)
			result=0;
		else
			result=num1 % num2;break;}
		}
		String value=String.valueOf(result);
				textfield.setText(value);
	}
	@FXML public void Clear(ActionEvent event){
		textfield.setText("");
		num1=0;
		num2=0;
		op=null;
	}
}
