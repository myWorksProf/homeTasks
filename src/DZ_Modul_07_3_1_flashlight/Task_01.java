package DZ_Modul_07_3_1_flashlight;

public class Task_01 {

	public static void main(String[] args) {
		var first = new flashlight();
		
		boolean flashlightIsLight = first.isLight();
		System.out.println("flashlight 1 state: " + flashlightIsLight);
		
		first.on();
		
		flashlightIsLight = first.isLight();
		System.out.println("flashlight 1 state: " + flashlightIsLight);
		
		
		
		var second = new flashlight();
		
		flashlightIsLight = second.isLight();
		System.out.println("flashlight 2 state: " + flashlightIsLight);
	}

}
