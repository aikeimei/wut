
// Java Program to swap bits
// in a given number

class q3 {
	public static void main(String[] args)
	{
		int x=28;
		int p1=0;
		int p2=3;
		int n=1;
		
//	static int swapBits(int x, int p1, int p2, int n)
//	{
		// Move all bits of first set
		// to rightmost side
		int set1 = (x >> p1) & ((1 << n) - 1);

		// Move all bits of second set
		// to rightmost side
		int set2 = (x >> p2) & ((1 << n) - 1);

		// XOR the two sets
		int xor = (set1 ^ set2);

		// Put the xor bits back to
		// their original positions
		xor = (xor << p1) | (xor << p2);

		// XOR the 'xor' with the original number
		// so that the two sets are swapped
		int result = x ^ xor;

//		return result;
//	}
//		int res = swapBits(28, 0, 3, 2);
		System.out.println("Result = " + result);

	// Driver program
	
	}
}


