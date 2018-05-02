/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifro.edu;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author 96486805234
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private JFXTextField jfxtxtNumero1,jfxtxtNumero2, jfxtxtResultado;
    
    @FXML
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    
        public JFXTextField getJfxtxtNumero1() {
            return jfxtxtNumero1;
        }

        public void setJfxtxtNumero1(JFXTextField jfxtxtNumero1) {
            this.jfxtxtNumero1 = jfxtxtNumero1;
        }

        public JFXTextField getJfxtxtNumero2() {
            return jfxtxtNumero2;
        }

        public void setJfxtxtNumero2(JFXTextField jfxtxtNumero2) {
            this.jfxtxtNumero2 = jfxtxtNumero2;
        }

        public JFXTextField getJfxtxtResultado() {
            return jfxtxtResultado;
        }

        public void setJfxtxtResultado(JFXTextField jfxtxtResultado) {
            this.jfxtxtResultado = jfxtxtResultado;
        }

        public Button getBtnSomar() {
            return btnSomar;
        }

        public void setBtnSomar(Button btnSomar) {
            this.btnSomar = btnSomar;
        }

        public Button getBtnSubtrair() {
            return btnSubtrair;
        }

        public void setBtnSubtrair(Button btnSubtrair) {
            this.btnSubtrair = btnSubtrair;
        }

        public Button getBtnMultiplicar() {
            return btnMultiplicar;
        }

        public void setBtnMultiplicar(Button btnMultiplicar) {
            this.btnMultiplicar = btnMultiplicar;
        }

        public Button getBtnDividir() {
            return btnDividir;
        }

        public void setBtnDividir(Button btnDividir) {
            this.btnDividir = btnDividir;
        }

     
    @FXML
    private void somar (ActionEvent event){
        Double num1 = Double.parseDouble(jfxtxtNumero1.getText());
        Double num2 = Double.parseDouble(jfxtxtNumero2.getText());
        Double resultado = num1 + num2;
        jfxtxtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void subtrair (ActionEvent event){
        Double num1 = Double.parseDouble(jfxtxtNumero1.getText());
        Double num2 = Double.parseDouble(jfxtxtNumero2.getText());
        Double resultado = num1 - num2;
        jfxtxtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void multiplicar (ActionEvent event){
        Double num1 = Double.parseDouble(jfxtxtNumero1.getText());
        Double num2 = Double.parseDouble(jfxtxtNumero2.getText());
        Double resultado = num1 * num2;
        jfxtxtResultado.setText(resultado.toString());
    }
    
        @FXML
    private void dividir (ActionEvent event){
        Double num1 = Double.parseDouble(jfxtxtNumero1.getText());
        Double num2 = Double.parseDouble(jfxtxtNumero2.getText());
        Double resultado = num1 / num2;
        jfxtxtResultado.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
