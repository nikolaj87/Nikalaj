package practice.taskfrombook1.gamefrombookseafight;

public class SimpleDotCom {

    int numOfHits;
    int[] locationCells = new int[7];


    public String checkYourself(String stringGuess){

        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells){
            if(guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
