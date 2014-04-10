package questionBank;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1924
 * 2007년 1월 1일은 월요일이다. 2007년 x월 y일은 무슨 요일인가?
 */
public class P0409 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int[] monthlyDate = {0, 1, -2, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
		String[] dayWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};
		int x, y, passDate;
		
		x = input.nextInt();
		y = input.nextInt();
		
		passDate = (x-1)*30 + y-1;
		
		for(int i = 0; i < x; i++){
			passDate += monthlyDate[i];
		}
		
		System.out.println(dayWeek[passDate%7]);
	}
}
