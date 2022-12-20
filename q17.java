import java.util.ArrayList;
import java.util.List;

class q17 {
			// Function to remove duplicate elements This function
			// returns new size of modified array.
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;

		

		// Print updated array
//		for (int i = 0; i < n; i++)
//			System.out.print(arr[i] + " ");
				// Return, if array is empty or contains a single
				// element
				if (n == 0 || n == 1)
					System.out.print("same array");
					

				List <Integer>visited = new ArrayList<Integer>();

				// Start traversing elements
				int r = 0;
				for (int i = 0; i < n ; i++) {
					
					// If current element is not equal to next
					// element then store that current element
					if (visited.contains(arr[i])==true)
						continue;
					else {
					visited.add(arr[i]);
						
					}
				}
				

				// Store the last element as whether it is unique or
				// repeated, it hasn't stored previously
//				temp[r++] = arr[n - 1];

				// Modify original array
				for(int j:visited) {
//					arr[j]=visited.get(j);
					System.out.println(visited.get(j));
					
					
				}
				

			

			
			}
		


	}


