package DZ_Modul_07_3_1_flashlight;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FlashlightTest {
	@Test
	void testFlashlightIsOff() {
		Flashlight flashlight = new Flashlight();
		assertFalse(flashlight.isLight());
	}
	
	  @Test
	    void testFlashlightFiveOnFive() {
	        Flashlight flashlight = new Flashlight();
	        for (int i = 0; i < 5; i++) {
	            flashlight.on();
	        }
	        Assert.assertTrue(flashlight.isLight());
	        }
	    @Test
	    void testFlashlightFiveOffFive() {
	        Flashlight flashlight = new Flashlight();
	        for (int i = 0; i < 5; i++) {
	            flashlight.off();
	        }
	        Assert.assertFalse(flashlight.isLight());
	    }
	
    @Test
    void testChinaIsOffAfterFiveOn() {
        ChinaBattery battery = new ChinaBattery(5);
        for (int i = 0; i < 5; i++) {
            battery.charge();
        }
        Assert.assertFalse(battery.charge());
    }
}