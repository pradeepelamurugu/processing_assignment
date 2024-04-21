import processing.core.PApplet;

public class Main extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DIAMETER = 50;
    private Ellipse[] ellipses;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        ellipses = new Ellipse[4];
        for (int i = 0; i < ellipses.length; i++) {
            ellipses[i] = new Ellipse(1, (i + 1) * (HEIGHT / 5), DIAMETER);
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < ellipses.length; i++) {
            ellipses[i].display();
            ellipses[i].move(i + 1);
        }
    }

    class Ellipse {
        float x, y;
        int diameter;
        float speed;

        Ellipse(float x, float y, int diameter) {
            this.x = x;
            this.y = y;
            this.diameter = diameter;
            this.speed = 1;
        }

        void display() {
            ellipse(x, y, diameter, diameter);
        }

        void move(float speed) {
            x += speed;
        }
    }

}

//import processing.core.PApplet;
//
//public class Main extends PApplet {
//
//    private static final int WIDTH = 640;
//    private static final int HEIGHT = 480;
//    public static final int DIAMETER = 50;
//    private int speed_of_ellipse_1 = 0, speed_of_ellipse_2 = 0, speed_of_ellipse_3 = 0, speed_of_ellipse_4 = 0;
//
//    public static void main(String[] args) {
//        PApplet.main("Main", args);
//    }
//
//    @Override
//    public void settings() {
//        super.settings();
//        size(WIDTH, HEIGHT);
//    }
//
//    @Override
//    public void draw() {
//        moveEllipseFromLeftToRight();
//    }
//
//    private void moveEllipseFromLeftToRight() {
//        ellipse(speed_of_ellipse_1, (float) HEIGHT / 5, DIAMETER, DIAMETER);
//        speed_of_ellipse_1++;
//        ellipse(speed_of_ellipse_2, (float) HEIGHT / 5 * 2, DIAMETER, DIAMETER);
//        speed_of_ellipse_2 = speed_of_ellipse_1 * 2;
//        ellipse(speed_of_ellipse_3, (float) HEIGHT / 5 * 3, DIAMETER, DIAMETER);
//        speed_of_ellipse_3 = speed_of_ellipse_1 * 3;
//        ellipse(speed_of_ellipse_4, (float) HEIGHT / 5 * 4, DIAMETER, DIAMETER);
//        speed_of_ellipse_4 = speed_of_ellipse_1 * 4;
//    }
//
//
//}
