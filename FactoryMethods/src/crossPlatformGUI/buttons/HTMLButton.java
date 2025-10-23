package crossPlatformGUI.buttons;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Hai cliccato sul bottone");

    }
}
