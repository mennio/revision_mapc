package patron_creationnel.abstractFactory;

public class victorienSofa implements sofa{
    @Override
    public String asLeg() {
        return "j'ai des jambe pour mon sofa victorien";
    }

    @Override
    public String sitOn() {
        return "je peux m asseoir sur le sofa victorien";
    }
}
