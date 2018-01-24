/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrussian;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Mohini
 */
public class FXMLGrammar implements Initializable {

    private final ListStorage listStorage = new ListStorage();
    
    @FXML
    private ListView<String> grammarTopics;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> obsList = FXCollections.observableArrayList();
        obsList.addAll(Arrays.asList(listStorage.getGrammarListView()));
        
        grammarTopics.setItems(obsList);
    }
    
}
