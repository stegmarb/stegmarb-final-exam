public class ArrayMixer {

  public int[] mixTwoArrays(int[] firstArray, int[] secondArray) {
    int[] resultArray = new int[firstArray.length + secondArray.length];
    if (firstArray.length == secondArray.length) {
      for (int i = 0; i < firstArray.length; i++) {
        resultArray[i * 2] = firstArray[i];
        resultArray[(i * 2) + 1] = secondArray[i];
      }
    } else if (firstArray.length > secondArray.length) {
      for (int i = 0; i < firstArray.length; i++) {
        if (i < secondArray.length) {
          resultArray[i * 2] = firstArray[i];
          resultArray[(i * 2) + 1] = secondArray[i];
        } else {
          resultArray[i + secondArray.length] = firstArray[i];
        }
      }
    } else {
      for (int i = 0; i < secondArray.length; i++) {
        if (i < firstArray.length) {
          resultArray[i * 2] = firstArray[i];
          resultArray[(i * 2) + 1] = secondArray[i];
        } else {
          resultArray[i + firstArray.length] = secondArray[i];
        }
      }
    }
    return resultArray;
  }
}
