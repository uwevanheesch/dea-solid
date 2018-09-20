package nl.han.oose.openclosed;

public class Square extends Rectangle {

    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }

    @Override
    public void setHeight(int value) {
        super.setHeight(value);
        super.setWidth(value);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Square(2);

        rectangle.setWidth(3);
        rectangle.setHeight(2);

        Rectangle rectangle2 = new Rectangle(2, 3);
        rectangle2.setWidth(3);
        rectangle2.setHeight(2);
    }
}
