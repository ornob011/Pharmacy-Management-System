
package com.hms.hms_test_2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class WarningController extends AnchorPane {

    public WarningController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Warning.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    

    @FXML Label formatLabel;
    public void addMessage(String message) {
        
        formatLabel.setText("Format: "+message);

    }
    
}
