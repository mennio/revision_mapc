package patron_structurel.adapter;

import patron_creationnel.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

       pieceRond pc1 = new pieceRond(4);
       trouRond tr1 = new trouRond(4);
       if(tr1.fits(pc1)){
           System.out.println("La pièce ronde r5 s'adapte au trou rond r5.");
       }

        pieceCarrer pr1Petit = new pieceCarrer(2);
        pieceCarrer pr1Grand = new pieceCarrer(20);


        PieceCarrerAdapter smallSqPegAdapter = new PieceCarrerAdapter(pr1Petit);
        PieceCarrerAdapter largeSqPegAdapter = new PieceCarrerAdapter(pr1Grand);

        if (tr1.fits(smallSqPegAdapter)) {
            System.out.println("La pièce carrée w2 s'adapte au trou rond r5.");
        }
        if (!tr1.fits(largeSqPegAdapter)) {
            System.out.println("La pièce carrée w20 s'adapte au trou rond r5.");
        }

    }
}