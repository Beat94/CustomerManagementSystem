import java.util.ArrayList;

public class Functions {
    
    private CustomerManager customerManager = new CustomerManager();
    
    public ArrayList<Customer> getCustomersFunctions(){
        return customerManager.getCustomerList();
    }


}
