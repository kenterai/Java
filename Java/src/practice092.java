
public class practice092 {
  public static void heal(int hp) {
    hp += 10;
  }
  public static void heal(practice091 thief) {
    thief.hp += 10;
  }
  public static void main(String[] args) {
    int baseHp = 25;
    practice091 t = new practice091("アサカ", baseHp);
    heal(baseHp);
    System.out.println(baseHp + " : " + t.hp);
    heal(t);
    System.out.println(baseHp + " : " + t.hp);
  }
}
