package skilllbox5.l2;

public class RandomTicket {
    public static void main(String[] args) {
            int [] ticketNumbers = new int[1000];
            int [] winTickets = new int[10];

            for(int i = 0; i < ticketNumbers.length; i++) {
                // Генерируем лотерейный билет, Math.round - округляет до ближайшего целого и возвращает int
                int value = 1000000 + (int) Math.round((1000000 * Math.random()));
                ticketNumbers[i] = value;
                System.out.println(value);
                if(i % 100 == 0) {
                    winTickets[i / 100] = value;
                }
            }

            System.out.println("\nWin tickets: ");
            for(int winTicketsNum: winTickets) {
                System.out.println(winTicketsNum);
            }
    }
}
