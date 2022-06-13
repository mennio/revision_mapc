package patron_structurel.adapter;

public class pieceCarrer {
    private double width;

    public pieceCarrer(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
