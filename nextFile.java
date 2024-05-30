class Solution {
	public int[] maxSlidingWindow(int[] nums, int k){
		if (nums.length == 0) return new int[0];

		//priority queue to keep track of max values
		PriorityQueue<Integer> maxHeap = new PriorityQueue(100, new maxHeap());
		int[] result = new int[nums.length - (k-1)];

		for(int i = 0; i < k; i++){
			maxHeap.add[nums[i]];
		}

		int left = 0;
		int right = k - 1;
		int p = 0;
		while (right < nums.length){
			result[p++] = maxHeap.peek();
			maxHeap.remove(nums[left++]);
			right++;
			if(right < nums.lenght){
				maxHeap.add(nums[right])
			}
		}
		return result;
	}

	public class maxHeap implements Comparator<Integer>{
		public int compare(Integer x, Integer y){
			return y - x;
		}
	}
}
