package com.lilith.array.demo01;

import java.util.Arrays;

import org.junit.Test;
/**
 * 冒泡算法
 * @author Perform
 *
 */
public class ClassTest {
//	@Test
	public void testArraySort() {
		int[] a = {6,5,4,3,2,1};
		int temp;
		for(int i = a.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j ++) {
				if(a[j] > a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}
	
	public void testArraySort02() {
		int[] a = {6,5,4,3,2,1};
		int temp;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
	
	@Test
	public void testArraySort1() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		
		int temp;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
