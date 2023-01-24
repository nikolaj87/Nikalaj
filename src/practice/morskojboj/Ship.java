package practice.morskojboj;
//
public class Ship {

    int size;
    int shotToDestroy;
    int isVertical;
    Location [] location;

    public Ship(int size, int shotToDestroy, int isVertical, Location[] location) {
        this.size = size;
        this.shotToDestroy = shotToDestroy;
        this.isVertical = isVertical;
        this.location = location;
    }

}
