import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Reversing {

	public static void main(String[] args) {
		List<String> abc = new LinkedList<String>();
		abc.add("asd1");
		abc.add("asd2");
		abc.add("asd3");
		abc.add("asd4");
		abc.add("asd5");
		ListIterator<String> ls = abc.listIterator();
		while (ls.hasNext()) {
			ls.next();
		}
		while (ls.hasPrevious()) {
			System.out.println(ls.previous());
		}
	}

}
