public class Review01 {
  public static void main(String[] args) {
    int priceWithoutTax = 1500;
    int taxPrice = tax(priceWithoutTax, 0.1);
    int priceIncludingTax = priceWithoutTax + taxPrice;
    System.out.println(
        String.format("%d円の商品の税込価格は%d円（消費税は%d円）です。", priceWithoutTax, priceIncludingTax, taxPrice));
  }

  public static int tax(int price, double taxRate) {
    return (int) (price * taxRate);
  }
}
