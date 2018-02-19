import org.junit.Test;
import sword2offer.Code_2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Trial Code");
	}

	@Test
	public void t_code_2() {
		Code_2 code_2 = new Code_2();
		StringBuffer str = new StringBuffer("We Are Happy");
		String s = code_2.replaceSpace(str);
		System.out.println(s);
	}
}
