package practice.lotery;

import java.util.Arrays;

class Ticket {

    String userName;
    int guessedNumbers;
    int[] numbers = new int[ListOfTickets.size];

    Ticket(String userName, int[] ticket) {
        this.userName = userName;
        this.numbers = ticket;
    }

    Ticket(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "LoteryTicket{" +
                "userName='" + userName + '\'' +
                ", ticket=" + Arrays.toString(numbers) +
                '}';
    }
}
