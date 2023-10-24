
import controller.Controller;


public class Main {

    public static void main(String[] args) {
        String title = "===== Analysis String program ====";
        String[] mc = new String[]{"Input String", "Exit"};
        Controller  c = new Controller(title, mc);
        c.run();
    }
}
