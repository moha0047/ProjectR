
package projectrussian;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author mohini
 */
public class FXMLMainPage implements Initializable {
    
    @FXML
    private ListView<String> mainPageListView;
    
    private final ChangeScene cs = new ChangeScene();
    private final ListStorage listStorage = new ListStorage();
    
    public int selectedDestination;
    public String destination;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> mainMenuList = FXCollections.observableArrayList(listStorage.mainMenuListview);
        mainPageListView.setItems(mainMenuList);
        
        mainPageListView.setOnMouseClicked((MouseEvent event) -> {
            System.out.println(mainPageListView.getSelectionModel().getSelectedIndex());
            cs.changeScene(event, listStorage.sceneDestinations[mainPageListView.getSelectionModel().getSelectedIndex()]);
        });
    }        
}
