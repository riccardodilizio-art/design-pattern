package PlatformGuiElement.factory;


import PlatformGuiElement.buttons.Button;
import PlatformGuiElement.buttons.HTMLButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
