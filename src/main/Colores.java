package main;

import clases.ButtonSubject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Colores extends Application {

	public void start(Stage primaryStage) {
		try {
			final VBox root = new VBox();
			HBox seccionBotones = new HBox();
			seccionBotones.setSpacing(40);
            seccionBotones.setAlignment(Pos.CENTER);
			ButtonSubject color1 = new ButtonSubject("Amarillo","yellow");
			ButtonSubject color2 = new ButtonSubject("Azul","blue");
			ButtonSubject color3 = new ButtonSubject("Rojo","red");
			
			Scene sc = new Scene(root, 600, 600);
			
			
			color1.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    cambiarColor(root,"yellow");
                    
                }
			});
			
			color2.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                	cambiarColor(root,"blue");
                	
                }
			});
            color3.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                	cambiarColor(root,"red");
                }
			});
            
			seccionBotones.getChildren().addAll(color1, color2, color3);
			root.getChildren().add(seccionBotones);
			
			primaryStage.setTitle("Tarea_aspectos");
			primaryStage.setScene(sc);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void cambiarColor(VBox root,String color) {
		BackgroundFill background_fill = new BackgroundFill(Color.valueOf(color), CornerRadii.EMPTY, Insets.EMPTY); 
        Background background = new Background(background_fill); 
        root.setBackground(background);
	}
	
	
}
