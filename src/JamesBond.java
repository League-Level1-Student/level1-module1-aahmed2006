

public class JamesBond {	
	Vault vault = new Vault();
	 void findCode(Vault vault) {
		for(int i = 0; i < 1000000; i++) {
			vault.tryCode(i);
		}
	}
	}

