package application;

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
import javafx.stage.Stage;

public class Colores extends Application {

	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			HBox seccionBotones = new HBox();
			seccionBotones.setSpacing(40);
                        seccionBotones.setAlignment(Pos.CENTER);
			Button color1 = new Button("Amarillo");
			Button color2 = new Button("Azul");
			Button color3 = new Button("Rojo");
			Scene sc = new Scene(root, 600, 600);
			
			color1.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    amarillo(root);
                }
			});
			color2.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    azul(root);
                }
			});
            color3.setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    rojo(root);
                }
			});
            
			seccionBotones.getChildren().addAll(color1, color2, color3);
			root.getChildren().add(seccionBotones);
			primaryStage.setScene(sc);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void amarillo(VBox root) {
		BackgroundFill background_fill = new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY); 
        Background background = new Background(background_fill); 
        root.setBackground(background);
	}
	
	public void azul(VBox root) {
		BackgroundFill background_fill = new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY); 
        Background background = new Background(background_fill); 
        root.setBackground(background);
	}
	
	public void rojo(VBox root) {
		BackgroundFill background_fill = new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY); 
        Background background = new Background(background_fill); 
        root.setBackground(background);
	}
	
}
