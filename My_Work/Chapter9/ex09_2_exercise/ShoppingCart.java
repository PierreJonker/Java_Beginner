
package Chapter9.ex09_2_exercise;


public class ShoppingCart {
    public static void main(String args[]){

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Bob Miller", "555-44-3212");
        Customer cust2 = new Customer("Pierre Jonker", "666-55-4323");

	// Print the customer object name
        System.out.println("Customer 1 name: "+cust1.getName());
        System.out.println("Customer 2 name: "+cust2.getName());
    }    
}
