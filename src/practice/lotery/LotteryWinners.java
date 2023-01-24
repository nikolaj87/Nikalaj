package practice.lotery;

public class LotteryWinners {

    static int amount;

    void lottery() {  //метод считает угаданные каждый игроком числа

        for (int i = 0; i < ListOfTickets.list.length; i++) {
            for (int j = 0; j < ListOfTickets.size; j++) {
                for (int k = 0; k < ListOfTickets.winCombination.length; k++) {
                    if (ListOfTickets.list[i].numbers[j] == ListOfTickets.winCombination[k]) {
                        ListOfTickets.list[i].guessedNumbers++;
                    }
                }
            }
        }
    }

    void winners() {  //выдуманный способ распределить выигрышь
        int counterFiveGuess = 0;
        int counterFourGuess = 0;
        int counterThreeGuess = 0;
        int counterTwoGuess = 0;
        int counterOneGuess = 0;
        for (int i = 0; i < ListOfTickets.list.length; i++) {
            if (ListOfTickets.list[i].guessedNumbers == 5) {
                counterFiveGuess++;
            } else if (ListOfTickets.list[i].guessedNumbers == 4) {
                counterFourGuess++;
            } else if (ListOfTickets.list[i].guessedNumbers == 3) {
                counterThreeGuess++;
            } else if (ListOfTickets.list[i].guessedNumbers == 2) {
                counterTwoGuess++;
            } else if (ListOfTickets.list[i].guessedNumbers == 1) {
                counterOneGuess++;
            }
        }

        double casinoWin;
        double fiveWin;
        double fourWin;
        double threeWin;
        double twoWin;
        double oneWin;

        casinoWin =  amount * 0.1;
        if(counterFiveGuess > 0)
            fiveWin   =  amount * 0.9 / 2 / counterFiveGuess;
        else
            fiveWin = 0;
        if(counterFourGuess > 0)
            fourWin   = (amount * 0.9 - fiveWin) / 2 / counterFourGuess;
        else
            fourWin = 0;
        if(counterThreeGuess > 0)
            threeWin  = (amount * 0.9 - fiveWin - fourWin) / 2 /counterThreeGuess;
        else
            threeWin = 0;
        if(counterTwoGuess > 0 )
            twoWin    = (amount * 0.9 - fiveWin - fourWin - threeWin) / 2 / counterTwoGuess;
        else
            twoWin = 0;
        if (counterOneGuess > 0)
            oneWin    = (amount * 0.9 - fiveWin - fourWin - threeWin - twoWin)/ counterOneGuess;
        else
            oneWin = 0;

        System.out.println("казино сегодня подняло " + casinoWin + "$");
        System.out.println("пять чисел угадало " + counterFiveGuess + " игроков по " + fiveWin + "$");
        System.out.println("четыре числа угадало " + counterFourGuess + " игроков по " + fourWin + "$");
        System.out.println("три числа угадало " + counterThreeGuess + " игроков по " + threeWin + "$");
        System.out.println("два числа угадало " + counterTwoGuess + " игроков по " + twoWin + "$");
        System.out.println("одно число угадало " + counterOneGuess + " игроков по " + oneWin + "$");

    }
}




