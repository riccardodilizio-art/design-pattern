package PlatformGuiElement;

import PlatformGuiElement.factory.Dialog;
import PlatformGuiElement.factory.HtmlDialog;
import PlatformGuiElement.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }
}
