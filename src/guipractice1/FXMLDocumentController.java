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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Priyesh Hingrajia
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    // code here goes for check box
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
    
    
    // code here goes for choice box
    @FXML
    private ChoiceBox choiceBox;

    @FXML
    private Label choiceBoxLabel;
    
    @FXML
    void choiceBoxPushed(ActionEvent event) {
         choiceBoxLabel.setText("Fav sport is \n" + choiceBox.getValue().toString());
    }

    
    // code here goes for combo box
    @FXML
    private ComboBox comboBox;

    @FXML
    private Label comboBoxLabel;
    
    @FXML
    void comboBoxPushed(ActionEvent event) {
       comboBoxLabel.setText("Fav Country : \n" + comboBox.getValue().toString() );
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // code here goes for check box
        CheckBoxLabel.setText("");
        
        // code here goes for choice box
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("Cricket");
        choiceBox.getItems().addAll("Tennis" , "Hockey");
        choiceBox.setValue("Tennis");
        
        // code here goes for combo box
        comboBoxLabel.setText("");
        comboBox.getItems().addAll("India" , "Canada" , "USA" , "China" , "South Africa" , "New Zealand");
        comboBox.setValue("India");
    }    
    
}
