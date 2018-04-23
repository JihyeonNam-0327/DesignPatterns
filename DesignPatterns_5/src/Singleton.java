
public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	public String getDescription() {
		return "나는 쓰레드세이프한 싱글톤이에요!";
	}
}
