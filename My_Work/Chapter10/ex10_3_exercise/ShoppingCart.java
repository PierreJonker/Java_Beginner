
package Chapter10.ex10_3_exercise;


public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 500.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
