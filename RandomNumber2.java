package practical1;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber2 {

	public static void main(String[] args) {

		Random nn = new Random();
		int[] numbers = new int[500];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 100 + nn.nextInt(900);
			System.out.println(numbers[i]);

		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Nth:");
		int k = scanner.nextInt();
		System.out.println("Smallest element for k = " + k + " : " + findKthSmallestElement(numbers, k));

	}

	/*
	 * Using priority queue, or min heap we can find out the kth smallest element.
	 * Following algorithm we are going to use in this program :
	 * 
	 * First create one Priority Queue Insert all elements to this priority queue
	 * Extract elements one by one from this priority queue. The kth element
	 * extracted is the kth smallest element
	 */
	public static int findKthSmallestElement(int[] array, int k) {

		PriorityQueue priorityQueue = new PriorityQueue();

		for (int i = 0; i < array.length; i++) {
			priorityQueue.offer(array[i]);
		}
		System.out.println("Final priority-queue " + priorityQueue);
		int currentNo = 0;
		while (k > 0) {
			currentNo = (int) priorityQueue.poll();
			k--;
		}
		return currentNo;
	}
}
