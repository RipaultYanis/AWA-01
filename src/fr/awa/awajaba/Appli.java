/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author root
 */
public class Appli extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Quitter...");
        MouseEvent click = null;
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            int nb=1;
            @Override
            public void handle(ActionEvent event) {
                System.out.println("GoodBye World...");
                
                
                if (nb == 3){
                    
                    primaryStage.close();
                }
                else{
                    nb=1+nb;
                }
                        
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("AWA-VButton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
