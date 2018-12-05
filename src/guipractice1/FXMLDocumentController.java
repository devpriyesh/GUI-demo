/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author Priyesh Hingrajia
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private CheckBox checkBoxPizza;

    @FXML
    private CheckBox checkBoxBurger;

    @FXML
    private CheckBox checkBoxBurrito;

    @FXML
    private CheckBox checkBoxSub;

    @FXML
    private Label CheckBoxLabel;

    @FXML
    void checkBoxPushed(ActionEvent event) {
        String order = "Your order is confirmed for :" ;
        
        if(checkBoxBurrito.isSelected())
            order += "\n Burritos" ;
        if(checkBoxBurger.isSelected())
            order += "\n Burger" ;
        if(checkBoxPizza.isSelected())
            order += "\n Pizza" ;
        if(checkBoxSub.isSelected())
            order += "\n  Sub" ;
        
        CheckBoxLabel.setText(order) ;
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // code here goes for check box
        CheckBoxLabel.setText("");
    }    
    
}
