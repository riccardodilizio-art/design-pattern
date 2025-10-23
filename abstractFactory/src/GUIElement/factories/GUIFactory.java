package GUIElement.factories;


import GUIElement.button.Button;
import GUIElement.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
