package patron_creationnel.abstractFactory;

public class victorienChair implements chaise  {
    @Override
    public String asLeg() {
        return "j'ai des jambe pour ma chaise victorien";
    }

    @Override
    public String sitOn() {
        return "je peux m asseoir sur la chaise victorien";
    }
}
