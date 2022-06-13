package patron_structurel.adapter;

public class PieceCarrerAdapter extends pieceRond{
    private pieceCarrer peg;

    public PieceCarrerAdapter(pieceCarrer peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double result;
        return result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }


}
