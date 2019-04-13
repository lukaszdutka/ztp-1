package zad2.two;

import java.awt.*;

class Colors {

    private static Color green_color;

    static Color getGreenColor() {
        if(green_color == null){
            green_color = new Color(0, 255, 0);
        }
        return green_color;
    }
}
