package patron_creationnel.abstractFactory;

public class modernChair implements chaise {

    @Override
    public String asLeg() {
        return "j'ai des jambe pour ma chaise modern";
    }

    @Override
    public String sitOn() {
        return "je peux m asseoir sur la chaise modern";
    }
}
