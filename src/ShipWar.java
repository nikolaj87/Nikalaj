import java.util.ArrayList;

public class ShipWar {

    protected ArrayList<Integer> loc = new ArrayList<>();

    public ShipWar(ArrayList<Integer> loc) {
        this.loc = loc;
    }

    public ShipWar() {
    }

    public void setLoc(ArrayList<Integer> loc) {
        this.loc = loc;
    }
}
