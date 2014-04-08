package questionBank;

/*
 * http://oj.leetcode.com/problems/single-number/
 * ����array �ȿ� �� �ϳ� �ִ� ¦ ���� ���� ã��.
 */
public class P0408 {
	public static void main(String[] args){
		int[] A = {1,3,1,-1,3};
		System.out.println(singleNumber(A));
	}

	public static int singleNumber(int[] A){
		
		int i, result = 0;
		
		for(i = 1, result = A[0]; i < A.length; i++){
			result ^= A[i];
		}
		return result;
	}

	//������ ����� ��!
//	public static int singleNumber(int[] A) {
//		return getSingleNumber(A, 2, 0);
//	}
//	
//	public static int getSingleNumber(int[] A, int divisor, int lastRemainder){
//
//		
//		//������ ���� 2�辿 �ø��鼭 ���ڸ� ��Ʈ�� ���ϼ� �˻�...
//		 
//		int r0 = 0, r1 = 0, rM0 = 0, rM1 = 0;
//		int temp0 = 0, temp1 = 0, tempM0 = 0, tempM1 = 0;
//		
//		for(int i = 0; i < A.length; i++){
//			if(A[i]%divisor == lastRemainder + divisor/2){
//				temp1 = A[i];
//				r1++;
//			} else if(A[i]%divisor == (-1)*(lastRemainder + divisor/2)){
//				tempM1 = A[i];
//				rM1++;
//			} else if(A[i]%divisor == lastRemainder){
//				temp0 = A[i];
//				r0++;
//			} else if(A[i]%divisor == (-1)*(lastRemainder)){
//				tempM0 = A[i];
//				rM0++;
//			}
//		}
//
//		if(r0 == 1){
//			return temp0;
//		} else if(r1 == 1){
//			return temp1;
//		} else if(rM0 == 1){
//			return tempM0;
//		} else if(rM1 == 1){
//			return tempM1;
//		} else if((r0+rM0) != 0 && (r0+rM0)%2 == 1){
//			return getSingleNumber(A, divisor*2, lastRemainder);
//		} else {
//			return getSingleNumber(A, divisor*2, lastRemainder + divisor/2);
//		}
//	}
}