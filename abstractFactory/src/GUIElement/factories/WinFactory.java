package GUIElement.factories;

import GUIElement.button.Button;
import GUIElement.checkboxes.Checkbox;
import GUIElement.button.WindowsButton;
import GUIElement.checkboxes.WindowsCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
