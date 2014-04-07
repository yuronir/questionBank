package questionBank;

import java.util.HashMap;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1002
 * �� �ͷ��� ��ǥ�� ���������� �Ÿ��� �־��� �� ���� �� �ִ� ������ ���ϱ� 
 */
public class Main {
	public static void main(String[] args){
		int x1, x2, y1, y2, r1, r2;
		double d;
		HashMap<Integer, int[]> data = new HashMap<Integer, int[]>();
		String[] temp;
		int[] temp2 = new int[6];
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int result = -2;
		
		//�� ȸ���� ������ ����
		for(int i = 0 ; i < count ; i++){
			temp = input.next().split(" ");
			for(int j = 0; j < temp.length; j++){
				temp2[j] = Integer.parseInt(temp[j]);
			}
			data.put(i, temp2);
		}
		
		for(int i = 0; i < count; i++){
			temp2 = (int[]) data.get(i);
			x1 = temp2[0]; y1 = temp2[1]; r1 = temp2[2];
			x2 = temp2[3]; y2 = temp2[4]; r2 = temp2[5];
			
			d = Math.sqrt((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
			
			if(r1 < r2){
				int ttemp = r1;
				r1 = r2;
				r2 = ttemp;
			} //r1�� r2���� ũ�ų� ���� ����� ������ �����Ѵ�.
			
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