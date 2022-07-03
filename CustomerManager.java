import java.util.ArrayList;

public class CustomerManager{
    private ArrayList<Customer> customerArr = new ArrayList<Customer>();
    
    public void addCustomer(Customer customer){
        customerArr.add(customer);
    }

    public Customer getCustomerById(int i){
        return customerArr.get(i);
    }

    public ArrayList<Customer> getCustomerList(){
        return this.customerArr;
    }

}