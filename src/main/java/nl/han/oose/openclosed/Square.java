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
}
