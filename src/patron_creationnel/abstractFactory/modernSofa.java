package patron_creationnel.abstractFactory;

public class modernSofa implements sofa{
    @Override
    public String asLeg() {
        return "j'ai des jambe pour mon sofa modern";
    }

    @Override
    public String sitOn() {
        return "je peux m asseoir sur le sofa modern";
    }
}
