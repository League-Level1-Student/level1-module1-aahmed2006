

public class Vault {
	void tryCode(int code) {
		int password = 12345;
		if (password == code) {
			System.out.println(password);
		} else {
			System.out.println("false");
		}
	}
}
