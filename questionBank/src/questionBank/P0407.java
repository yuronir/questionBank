package questionBank;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1002
 * �� �ͷ��� ��ǥ�� ���������� �Ÿ��� �־��� �� ���� �� �ִ� ������ ���ϱ� 
 */
public class P0407 {
	public static void main(String[] args){
		int x1, x2, y1, y2, r1, r2;
		double d;
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();

		for(int i = 0; i < count; i++){
			
			int result = -2;
			x1 = input.nextInt(); y1 = input.nextInt(); r1 = input.nextInt();
			x2 = input.nextInt(); y2 = input.nextInt(); r2 = input.nextInt();
			
			d = Math.sqrt((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));

			if(r1 < r2){
				int ttemp = r1;
				r1 = r2;
				r2 = ttemp;
			} //r1�� r2���� ũ�ų� ���� ����� ������ �����Ѵ�.
			

			//�Ǻ� ����
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
			//�Ǻ� ��
			
			System.out.println(result);
		}
	}
}