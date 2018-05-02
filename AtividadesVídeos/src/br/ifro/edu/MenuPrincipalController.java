/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifro.edu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author 96486805234
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private void cadastrarAluno(ActionEvent event) { 
        try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),350,200);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Aluno");
        stage.setScene(scene);
        stage.show();
        }
        
        catch(IOException e){
        }
    }

    @FXML
    private void calculadora(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320,200);
        Stage stage = new Stage();
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        }
        
        catch(IOException e){
        }
    }

    @FXML
    private void fechar(ActionEvent event) {
        
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
}
