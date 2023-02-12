package practice.lotery;

class ListOfTickets {

    static Ticket[] list;
    static int[] winCombination;
    static int size = 5;

    Ticket myTicketCreate(){
        String name = Requests.userNameRequest();
        int num1 = Requests.numberRequest("введите первый номер от 1 до 50");
        int num2 = Requests.numberRequest("введите второй номер от 1 до 50");
        int num3 = Requests.numberRequest("введите третий номер от 1 до 50");
        int num4 = Requests.numberRequest("введите четвертый номер от 1 до 50");
        int num5 = Requests.numberRequest("введите пятый номер от 1 до 50");
        return new Ticket(name, new int[]{num1, num2, num3, num4, num5});
    }

    void createList(Ticket myTicket, int numberOfplayers){
        list = new Ticket[numberOfplayers];
        list[0] = myTicket;
        for (int i = 1; i < numberOfplayers; i++) {
            list[i] = new Ticket("Игрок " + i);
            list[i].numbers = fillTicket();
        }
        winCombination = fillTicket();
    }

    int[] fillTicket() {                                         //метод создает массив и наполняет значениями 1-50

        int[] fiveNumbers = new int[size];                          //так чтоб они не повторялись
        boolean flag;

        for (int i = 0; i < fiveNumbers.length; i++) {            //внешний цикл отвечает за номер элемента 0-1-2-3-4
            while (true) {                                        //вайл пытается призначить
                int number = (int) (Math.random() * 50 + 1);      //случайное число
                flag = false;
                for (int fiveNumber : fiveNumbers) {     //внутренний фор проверяет нет ли уже такого числа
                    if (fiveNumber == number) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {                                        //если нету
                    fiveNumbers[i] = number;                        //то можно его присвоить элементу из внешнего фор
                    break;
                }
            }
        }
        return fiveNumbers;
    }
}
