
public class practice052 {
	public static void main(String[] args) {
		email("お誘い", "uso800@xxxx.com", "今度、飲みにいきませんか");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}