package headFirstJava;

public class ExercitiuRandomUnu {

	public static void main(String[] args) {
		 int bottlesNum = 7;
		 String word = "Hanas";
		 while (bottlesNum > 0) {
		 if (bottlesNum == 1) {
		 word = "Hana"; // singular, as in ONE bottle.
		 }
		 System.out.println(bottlesNum + " white " + word + ", hanging on the couch");
		 System.out.println(bottlesNum + " white " + word + ", hanging on the couch");
		 System.out.println("And if one white Hana should accidentally fall,");
		 bottlesNum = bottlesNum - 1;
		 if (bottlesNum > 0) {
		 System.out.println("There'll be " + bottlesNum +
		 " white " + word + ", hanging on the couch");
		 } else {
		 System.out.println("There'll be no white Hanas, hanging on the couch");
		 } // end else
		 } // end while loop
		 } // end main method
		} // end class
