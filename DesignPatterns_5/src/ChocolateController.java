
public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		/*boiler.fill();
		boiler.boil();
		boiler.drain();*/

		System.out.println("---------����----------\n");
		// �̹� �����ϴ� �ν��Ͻ��� return�� ��
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
