package week7.day2Encapsulation;

public class LearnThreadlocal {

	private static final ThreadLocal<Integer> ccpin = new ThreadLocal<Integer>();

	private void setpin() {
		ccpin.set(9876);
	}
	public int getpin() {
		return ccpin.get();
	}

	/*
	 * public static void main(String[] args) { cc.set(1234);// To assign value use
	 * set method System.out.println(cc.get());//By using get method able the value
	 * which is set in the thread cc.remove();//remove the value from the thread
	 * local System.out.println(cc.get());
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
	LearnThreadlocal itl = new LearnThreadlocal();
	//itl.getpin();
	System.out.println(itl.getpin());
}
}
