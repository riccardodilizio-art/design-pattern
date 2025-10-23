package crossPlatformGUI.factory;

import crossPlatformGUI.buttons.Button;
import crossPlatformGUI.buttons.HTMLButton;

import javax.swing.*;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
