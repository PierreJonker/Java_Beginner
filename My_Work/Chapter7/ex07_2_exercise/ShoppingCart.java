
package Chapter7.ex07_2_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Pierre Jonker";
        String firstName;
        String lastName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        lastName = custName.substring(spaceIdx+1);
        System.out.println(lastName);
          
        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        sb.append(" Jonker");
        System.out.println(sb);
	// Challenge: sb.append(custName.substring(spaceIdx));
        sb = new StringBuilder(lastName);
        sb.append(" Pierre");

        System.out.println(sb);
    }    
}
