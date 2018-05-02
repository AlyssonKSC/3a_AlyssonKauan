/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifro.edu;

import br.ifro.edu.modelo.Aluno;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 96486805234
 */
public class AlunoController implements Initializable {

    @FXML
    private JFXTextField jfxtxtNome;
    @FXML
    private Button btnFechar;
    @FXML
    private Button btnOk;

        public JFXTextField getJfxtxtNome() {
            return jfxtxtNome;
        }

        public void setJfxtxtNome(JFXTextField jfxtxtNome) {
            this.jfxtxtNome = jfxtxtNome;
        }

        public Button getBtnFechar() {
            return btnFechar;
        }

        public void setBtnFechar(Button btnFechar) {
            this.btnFechar = btnFechar;
        }

        public Button getBtnOk() {
            return btnOk;
        }

        public void setBtnOk(Button btnOk) {
            this.btnOk = btnOk;
        }    
        
    @FXML
    private void salvar (){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome(jfxtxtNome.getText());
        
        em.getTransaction().begin();
        
        em.persist(aluno1);
        
        em.getTransaction().commit();
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
