public class CompareTwoFloatArrays {
    public static void main(String args[])
    {
    float[] arr1 = new float[] { 1.1f, 2.5f, 4.3f, 5.1f };
    float[] arr2 = new float[] { 2.4f, 2.2f, 1.9f, 5.9f };
    float[] arr3 = new float[] { 1.1f, 2.5f, 4.3f, 5.1f };
    System.out.println(compareArrays(arr2, arr3));
    System.out.println(compareArrays(arr1, arr3));
    System.out.println(compareArrays(arr1, arr2));
    }
    public static boolean compareArrays(float arr1[],float arr2[])
    {
    if (arr1.length != arr2.length)
    return false;
    for (int i = 0; i < arr1.length; i++) {
    if (arr1[i] != arr2[i])
    return false;
    }
    return true;
    }
    };
    