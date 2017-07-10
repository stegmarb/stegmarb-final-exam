import java.util.Arrays;

public class ArrayMixer {
  public static void main(String[] args) {
    int[] testArray1 = {1, 2 ,3};
    int[] testArray2 = {6, 7, 8};
    System.out.println(Arrays.toString(mixTwoArrays(testArray1, testArray2)));
  }

  public static int[] mixTwoArrays(int[] firstArray, int[] secondArray) {
    int[] resultArray = new int[firstArray.length + secondArray.length];
    for (int i = 0; i < firstArray.length; i++) {
      resultArray[i * 2] = firstArray[i];
      resultArray[(i *2) + 1] = secondArray[i];
    }
    return resultArray;
  }
}
