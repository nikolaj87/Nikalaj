package Practice.More.MorskojBoj;

class Messanger {
    static String messageReturner() {
        String[] messageArray = new String[4];
        messageArray[0] = "промах";
        messageArray[1] = "мимо";
        messageArray[2] = "по воробьям:-)";
        messageArray[3] = "корабль совсем не там";
        return messageArray[(int)(Math.random()*(messageArray.length))];
    }

}
