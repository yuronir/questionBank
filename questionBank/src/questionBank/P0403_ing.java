package questionBank;

import java.util.HashMap;
import java.util.Scanner;
/*
 * https://www.acmicpc.net/problem/1009
 * �� �������� ������ �׻� a^b���� ���·� �־�����. 
 * ����̴� ���� ������ �����Ͱ� ó���� ��ǻ���� ��ȣ�� �ñ�������. �̸� �������ִ� ���α׷��� �ۼ��϶�.
 */
public class P0403_ing {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		HashMap data = new HashMap();
		String[] temp;
		double result;
	
		for(int i = 0 ; i < input.nextInt() ; i++){
			temp = input.next().split(" ");
			data.put(i, temp);
		}
		
		for(int j = 0; j < data.size(); j++){
			if(data.get(j) == null){
				continue;
			}
			
			temp = (String[]) data.get(j);
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			//a^b�� ��Ģ�� ã�Ƽ� ������ ���� ã��.
			b=b%4;
			
			result = Math.pow(a, b)%10;
			if(result == 0){
				result = 10;
			}
			System.out.println(result);
		}
	}
}