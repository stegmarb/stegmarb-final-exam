import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMixerTest {

  private int[] testArray1 = {1, 2 ,3};
  private int[] testArray2 = {6, 7, 8};
  private int[] testArrayLonger = {4, 5, 9, 0, 1};
  private ArrayMixer arrayMixer;

  @Before
  public void setUp() {
    arrayMixer = new ArrayMixer();
  }

  @Test
  public void testMixTwoArraysWithEqualLengthArrays() {
    int[] mixedArray = arrayMixer.mixTwoArrays(testArray1, testArray2);
    assertTrue(mixedArray.length == 6);
    assertEquals(1, mixedArray[0]);
    assertEquals(6, mixedArray[1]);
    assertEquals(2, mixedArray[2]);
    assertEquals(7, mixedArray[3]);
    assertEquals(3, mixedArray[4]);
    assertEquals(8, mixedArray[5]);
  }

  @Test
  public void testMixTwoArraysWhenFirstArrayLonger() {
    int[] mixedArray = arrayMixer.mixTwoArrays(testArrayLonger, testArray2);
    assertTrue(mixedArray.length == 8);
    assertEquals(4, mixedArray[0]);
    assertEquals(6, mixedArray[1]);
    assertEquals(5, mixedArray[2]);
    assertEquals(7, mixedArray[3]);
    assertEquals(9, mixedArray[4]);
    assertEquals(8, mixedArray[5]);
    assertEquals(0, mixedArray[6]);
    assertEquals(1, mixedArray[7]);
  }

  @Test
  public void testMixTwoArraysWhenSecondArrayLonger() {
    int[] mixedArray = arrayMixer.mixTwoArrays(testArray1, testArrayLonger);
    assertTrue(mixedArray.length == 8);
    assertEquals(1, mixedArray[0]);
    assertEquals(4, mixedArray[1]);
    assertEquals(2, mixedArray[2]);
    assertEquals(5, mixedArray[3]);
    assertEquals(3, mixedArray[4]);
    assertEquals(9, mixedArray[5]);
    assertEquals(0, mixedArray[6]);
    assertEquals(1, mixedArray[7]);
  }
}