package robots;

import java.awt.Robot;
import java.awt.MouseInfo;

public class MouseMover {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        while (true) {
            int x = MouseInfo.getPointerInfo().getLocation().x;
            int y = MouseInfo.getPointerInfo().getLocation().y;

            robot.mouseMove(x + 1, y);
            Thread.sleep(100);
            robot.mouseMove(x, y);

            Thread.sleep(60000);
        }
    }
}