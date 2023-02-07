
public class SumIndexCalc {

	public static void main(String[] args) {
		int[] inputArray = { 5, 2, 7, 11, 15 };
		int sum = 9;

		int[] result = findNumberIndex(inputArray, sum);
		System.out.println(result[0] + ":" + result[1]);
	}

	private static int[] findNumberIndex(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] + inputArray[i + 1] == sum)
				return new int[] { i, i + 1 };
		}
		return new int[] {};
	}
}
