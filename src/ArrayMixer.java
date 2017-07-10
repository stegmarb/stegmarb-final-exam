public class ArrayMixer {

  public int[] mixTwoArrays(int[] firstArray, int[] secondArray) {
    int[] resultArray = new int[firstArray.length + secondArray.length];
    for (int i = 0; i < firstArray.length; i++) {
      resultArray[i * 2] = firstArray[i];
      resultArray[(i *2) + 1] = secondArray[i];
    }
    return resultArray;
  }
}
