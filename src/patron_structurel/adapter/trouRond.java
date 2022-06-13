package patron_structurel.adapter;

public class trouRond {
    private int radius;

    public trouRond(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(pieceRond peg){
        boolean result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
