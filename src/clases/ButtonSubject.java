package clases;

import java.util.ArrayList;

import javafx.scene.control.Button;


//Se creó esta clase debido a que el IDE no me dejaba agregar la lista 'observers' a 'Button' mediante el aspecto
public class ButtonSubject extends Button {
	private String color;
	
	public ButtonSubject(String text,String color) {
		super(text);
		this.color = color;
	} 
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}
