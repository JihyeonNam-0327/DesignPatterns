
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		/*boiler.fill();
		boiler.boil();
		boiler.drain();*/

		System.out.println("---------구분----------\n");
		// 이미 존재하는 인스턴스를 return할 것
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
