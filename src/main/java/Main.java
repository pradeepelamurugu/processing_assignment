import processing.core.PApplet;

public class Main extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    public static final int DIAMETER = 50;
    private int speed_of_ellipse_1 = 0, speed_of_ellipse_2 = 0, speed_of_ellipse_3 = 0, speed_of_ellipse_4 = 0;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        moveEllipseFromLeftToRight();
    }

    private void moveEllipseFromLeftToRight() {
        ellipse(speed_of_ellipse_1, (float) HEIGHT / 5, DIAMETER, DIAMETER);
        speed_of_ellipse_1++;
        ellipse(speed_of_ellipse_2, (float) HEIGHT / 5 * 2, DIAMETER, DIAMETER);
        speed_of_ellipse_2 = speed_of_ellipse_1 * 2;
        ellipse(speed_of_ellipse_3, (float) HEIGHT / 5 * 3, DIAMETER, DIAMETER);
        speed_of_ellipse_3 = speed_of_ellipse_1 * 3;
        ellipse(speed_of_ellipse_4, (float) HEIGHT / 5 * 4, DIAMETER, DIAMETER);
        speed_of_ellipse_4 = speed_of_ellipse_1 * 4;
    }


}
