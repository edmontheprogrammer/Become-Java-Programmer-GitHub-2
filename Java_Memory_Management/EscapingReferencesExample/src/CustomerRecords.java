import java.util.*;

public class CustomerRecords implements Iterable<Customer> {

    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap(this.records);
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }

   
}
