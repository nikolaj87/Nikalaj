package AllHomeTasks.Home5.Task4.MorskojBoj;

class Randomizer {

    static int setterVerticalHorizontal (){
        return ((int)(Math.random()*2));
    }

    static int randomSize (int shipSize, int size){
        return ((int)(Math.random() * size));
    }

    static int randomSize_2 (int shipSize, int size){
        return (int)(Math.random() * (size-(shipSize - 1)));
    }

}



