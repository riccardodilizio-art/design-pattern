package GUIElement.factories;

import GUIElement.button.Button;
import GUIElement.checkboxes.Checkbox;
import GUIElement.button.LinuxButton;
import GUIElement.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
