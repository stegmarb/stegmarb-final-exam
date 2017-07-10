import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMixerTest {

  int[] testArray1 = {1, 2 ,3};
  int[] testArray2 = {6, 7, 8};
  public ArrayMixer arrayMixer;

  @Before
  public void setUp() {
    arrayMixer = new ArrayMixer();
  }

  @Test
  public void testMixTwoArrays() {
    int[] mixedArray = arrayMixer.mixTwoArrays(testArray1, testArray2);
    assertTrue(mixedArray.length == 6);
    assertEquals(1, mixedArray[0]);
    assertEquals(6, mixedArray[1]);
    assertEquals(2, mixedArray[2]);
    assertEquals(7, mixedArray[3]);
    assertEquals(3, mixedArray[4]);
    assertEquals(8, mixedArray[5]);
  }

}