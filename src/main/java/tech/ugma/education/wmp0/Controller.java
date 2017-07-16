package tech.ugma.education.wmp0;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import org.controlsfx.control.PlusMinusSlider;

/**
 * Controls the elements of the FXML document.
 */
public class Controller {
    @FXML
   private PlusMinusSlider plusMinusSlider;

    @FXML
   private Rectangle rectangle = new Rectangle();


    /**
     * Called right after FXML file is loaded; lots takes place here.
     */
    @FXML
    private void initialize() {

        plusMinusSlider.setOnValueChanged(event -> rectangle.setX(event.getValue() + rectangle.getX()));
    }
}
