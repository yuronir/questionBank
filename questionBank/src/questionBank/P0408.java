package questionBank;

/*
 * http://oj.leetcode.com/problems/single-number/
 * 숫자array 안에 단 하나 있는 짝 없는 숫자 찾기.
 */
public class P0408 {
	public static void main(String[] args){
		int[] A = {1,3,1,-1,3};
		System.out.println(singleNumber(A));
	}

	public static int singleNumber(int[] A) {
		return getSingleNumber(A, 2, 0);
	}

	public static int getSingleNumber(int[] A, int divisor, int lastRemainder){

		/*
		 * 나누는 수를 2배씩 늘리면서 윗자리 비트의 동일성 검사...
		 */
		int r0 = 0, r1 = 0, rM0 = 0, rM1 = 0;
		int temp0 = 0, temp1 = 0, tempM0 = 0, tempM1 = 0;
		
		for(int i = 0; i < A.length; i++){
//			System.out.println("A[i] = " + A[i] + ", divisor = " + divisor + ", A[i]%divisor = " + A[i]%divisor);
			if(A[i]%divisor == lastRemainder + divisor/2){
				temp1 = A[i];
				r1++;
			} else if(A[i]%divisor == (-1)*(lastRemainder + divisor/2)){
				tempM1 = A[i];
				rM1++;
			} else if(A[i]%divisor == lastRemainder){
				temp0 = A[i];
				r0++;
			} else if(A[i]%divisor == (-1)*(lastRemainder)){
				tempM0 = A[i];
				rM0++;
			}
		}
		System.out.println("r0 = " + r0 + ", r1 = " + r1 + ", divisor = " + divisor + ", lastRe = " + lastRemainder);
		if(r0 == 1){
			return temp0;
		} else if(r1 == 1){
			return temp1;
		} else if(rM0 == 1){
			return tempM0;
		} else if(rM1 == 1){
			return tempM1;
		} else if((r0+rM0) != 0 && (r0+rM0)%2 == 1){
			return getSingleNumber(A, divisor*2, lastRemainder);
		} else {
			return getSingleNumber(A, divisor*2, lastRemainder + divisor/2);
		}
	}
}