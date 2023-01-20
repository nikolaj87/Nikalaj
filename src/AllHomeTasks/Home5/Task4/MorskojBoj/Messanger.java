package AllHomeTasks.Home5.Task4.MorskojBoj;

class Messanger {
    static String messageReturnerMimo() {
        String[] messageArray = new String[4];
        messageArray[0] = "промах";
        messageArray[1] = "мимо";
        messageArray[2] = "по воробьям:-)";
        messageArray[3] = "корабль совсем не там";
        return messageArray[(int)(Math.random()*(messageArray.length))];
    }

    static String messageReturnerAgain() {
        String[] messageArray = new String[4];
        messageArray[0] = "Не хитри! Такой ход уже был!!!!!";
        messageArray[1] = "корабль уже горит, пробуй еще";
        messageArray[2] = "зачем стрелять тудаже? :-)";
        messageArray[3] = "так нам не победить :-/";
        return messageArray[(int)(Math.random()*(messageArray.length))];
    }

    static String messageReturnerGoal() {
        String[] messageArray = new String[4];
        messageArray[0] = "В яблочко!!!";
        messageArray[1] = "точное попадание";
        messageArray[2] = "корабль подбит, продолжай";
        messageArray[3] = "точно в цель";
        return messageArray[(int)(Math.random()*(messageArray.length))];
    }

}
