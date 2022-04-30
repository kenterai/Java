
public class practice141 {
	String accountNumber;
	int balance;

	public String toString() {
		return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof practice141) {
			practice141 p = (practice141)o;
			String an1 = this.accountNumber.trim();
			String an2 = p.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}