package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // can be any object type except String. Strings get turned into objects.

	private int getitemsReceived() {
		return itemsReceived;
	}

	void setitemsReceived() {
		if (itemsReceived < 0) {
			this.itemsReceived = 0;
		} else {
			this.itemsReceived = itemsReceived;
		}
	}

	private float getdegreesTurned() {
		return degreesTurned;
	}

	void setdegreesTurned() {
		this.degreesTurned = degreesTurned;
	}

	private String getnomenclature() {
		return nomenclature;
	}

	void setnomenclature() {
		if (nomenclature.equals("")) {
			this.nomenclature = " ";
		} else {
			this.nomenclature = nomenclature;
		}
	}

	private Object getmemberObj() {
		return memberObj;
	}

	void setmemberObj() {
		String s = memberObj.toString();
		if (s.equals(memberObj)) {
			this.memberObj = (Object) memberObj;
		} else {
			this.memberObj = memberObj;
		}
	}

	public static void main(String[] args) {

	}
}
