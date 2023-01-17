package Practice.More.MorskojBoj;

class Randomizer {

    static int size = GameBoard.size;

    static int setterVerticalHorizontal (){
        return ((int)(Math.random()*2));
    }

    static int randomSize (){
        return ((int)(Math.random() * size));
    }

    static int randomSize_2 (){
        return (int)(Math.random() * (size-2));
    }

}



