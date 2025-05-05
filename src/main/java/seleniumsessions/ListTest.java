package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		A nichu = new A("nichu");
		A appu = new A("appu");

		List<A> ls = new ArrayList<>();
		ls.add(nichu);
		ls.add(appu);
		
		System.out.println(ls);
		System.out.println(ls.toString());
		
		List<Integer> intArrLs = new ArrayList<Integer>();
		int[] intArr = new int[2];
		
		System.out.println(intArrLs);
		System.out.println(intArr);
		
	}
	
	public static class A extends Object {
		private final String name;
		
		public A(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

}
