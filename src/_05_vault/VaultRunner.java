package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		JamesBond j = new JamesBond();
		Vault v = new Vault();
		System.out.println(j.findCode(v));
	}
}
