package GUIElement.factories;

import GUIElement.button.Button;
import GUIElement.checkboxes.Checkbox;
import GUIElement.button.MacOSButton;
import GUIElement.checkboxes.MacOSCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
