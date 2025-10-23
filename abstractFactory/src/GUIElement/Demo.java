package GUIElement;

import GUIElement.app.Application;
import GUIElement.factories.GUIFactory;
import GUIElement.factories.LinuxFactory;
import GUIElement.factories.MacFactory;
import GUIElement.factories.WinFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            guiFactory = new LinuxFactory();
        } else if (osName.contains("windows")) {
            guiFactory = new WinFactory();
        } else if (osName.contains("mac")) {
            guiFactory = new MacFactory();
        } else {
            throw new RuntimeException("Sistema operativo non supportato: " + osName);
        }
        app = new Application(guiFactory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
