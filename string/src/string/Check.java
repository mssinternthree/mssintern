package string;
public class Check {
	  public static void main(String[] args) {
	    String firstName = "Surya";
	    String newName = new String("surya");
	    String name = "Surya";
	    String name2 = "surya";
	    
	    System.out.println(firstName.equals(newName));
	    System.out.println(firstName==newName);
	    System.out.println(firstName.compareTo(newName));
	    System.out.println(firstName.compareToIgnoreCase(newName));
	    System.out.println(firstName.equalsIgnoreCase(newName));
	    System.out.println(Integer.toHexString(firstName.hashCode()));
	    System.out.println(Integer.toHexString(name.hashCode()));
	    System.out.println(Integer.toHexString(name2.hashCode()));
	    System.out.println(Integer.toHexString(newName.hashCode()));
	  }
	}
