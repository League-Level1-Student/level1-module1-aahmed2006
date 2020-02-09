package _05_vault;

import java.util.Random;

public class Vault {
	int SecretCode = new Random().nextInt(1000001);

	boolean tryCode(int guess) {
		if (SecretCode == guess) {
			return true;
		} else {
			return false;
		}
	}
}
