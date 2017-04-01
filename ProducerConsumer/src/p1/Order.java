package p1;

public class Order {
	
	private static int i = 0;

	  private int count = i++;

	  public Order() {
	    if (count == 10) {
	      System.out.println("Out of food, closing");
	      System.out.println("exiting");
	      System.exit(0);
	    }
	  }

	  public String toString() {
	    return "Order " + count;
	  }

}
