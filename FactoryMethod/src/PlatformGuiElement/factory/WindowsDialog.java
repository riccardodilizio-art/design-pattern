package PlatformGuiElement.factory;


import PlatformGuiElement.buttons.Button;
import PlatformGuiElement.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
