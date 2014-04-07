package questionBank;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1002
 * 두 터렛의 좌표와 각각에서의 거리가 주어질 때 나올 수 있는 가짓수 구하기 
 */
public class P0407 {
	public static void main(String[] args){
		int x1, x2, y1, y2, r1, r2;
		double d;
		int[][] temp;
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		temp = new int[count][6];
		
		//각 회차의 정보를 저장
		for(int i = 0 ; i < count ; i++){
			for(int j = 0; j < 6; j++){
				temp[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < count; i++){
			
			int result = -2;
			x1 = temp[i][0]; y1 = temp[i][1]; r1 = temp[i][2];
			x2 = temp[i][3]; y2 = temp[i][4]; r2 = temp[i][5];
			
			d = Math.sqrt((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));

			if(r1 < r2){
				int ttemp = r1;
				r1 = r2;
				r2 = ttemp;
			} //r1이 r2보다 크거나 같게 만들고 연산을 시작한다.
			
			if(d == 0){
				if(r1==r2){
					result = -1;
				} else{
					result = 0;
				}
			}
			
			else if(r1 > d){
				if(r1 > (d + r2)){
					result = 0;
				} else if(r1 == (d+r2)){
					result = 1;
				} else if(r1 < (d+r2)){
					result = 2;
				}
			}
			
			else if(r1 == d){
				result = 2;
			}
			
			else if(r1 < d){
				if(r1 > (d-r2)){
					result = 2;
				} else if(r1 == (d-r2)){
					result = 1;
				} else if(r1 < (d-r2)){
					result = 0;
				}
			}
			
			System.out.println(result);
		}
	}
}
