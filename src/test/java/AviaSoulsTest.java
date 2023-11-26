import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.AviaSouls;
import ru.netology.javaqa.Ticket;
import ru.netology.javaqa.TicketTimeComparator;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AviaSoulsTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = manager.search("Москва", "Казань");
        Ticket[] expected = {ticket1, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }



    @Test
    public void testSortTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = manager.search("Санкт-Петербург", "Москва");
        Ticket[] expected = {ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTickets0() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = manager.search("Санкт-Петербург", "Уфа");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва", "Казань", comparator);
        Ticket[] expected = {ticket1, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsComparator1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Сочи", "Санкт-Петербург", comparator);
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTicketsComparator0() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Казань", 2500, 20, 23);
        Ticket ticket2 = new Ticket("Санкт-Петербург", "Москва", 1400, 10, 13);
        Ticket ticket3 = new Ticket("Сочи", "Санкт-Петербург", 11000, 7, 15);
        Ticket ticket4 = new Ticket("Москва", "Казань", 5500, 9, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Москва", "Екатеринбург", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}

