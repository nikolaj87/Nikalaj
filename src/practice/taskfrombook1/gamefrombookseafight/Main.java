package practice.taskfrombook1.gamefrombookseafight;

public class Main {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        int randomNum = (int)(Math.random()*5);

        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();

        int[] locations = {randomNum, randomNum + 1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive){
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses);
            }
        }
    }
}
