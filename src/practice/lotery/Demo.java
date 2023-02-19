package practice.lotery;

import java.util.Arrays;
import java.util.List;
//для иммитации реальных условий надо 200-500 тыс участников
public class Demo {

    public static void main(String[] args) {
        ListOfTickets game = new ListOfTickets();
        LotteryWinners winners = new LotteryWinners();

        System.out.println("Игра лотерея");
        int numberOfPlayers = Requests.numberRequest("введите общее количество игроков");
        System.out.println("призовой фонд " + (LotteryWinners.amount = numberOfPlayers * 10) + "$");

        Ticket myTicket = game.myTicketCreate();
        game.createList(myTicket, numberOfPlayers);

        System.out.println(Arrays.toString(ListOfTickets.list));
        System.out.println("ваш билет " + ListOfTickets.list[0]);
        System.out.println("выиграшная комбинация " + Arrays.toString(ListOfTickets.winCombination));

        winners.lottery();
        winners.winners();

    }

}
