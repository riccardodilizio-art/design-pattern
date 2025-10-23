package crossPlatformGUI.factory;

import crossPlatformGUI.buttons.Button;
import crossPlatformGUI.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
