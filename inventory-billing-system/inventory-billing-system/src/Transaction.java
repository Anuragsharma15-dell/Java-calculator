import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private LocalDateTime date;
    private double total;
    private List<String> items;

    public Transaction(LocalDateTime date, double total, List<String> items) {
        this.date = date;
        this.total = total;
        this.items = items;
    }

    @Override
    public String toString() {
        return date + " | Total: Rs." + total;
    }
}
