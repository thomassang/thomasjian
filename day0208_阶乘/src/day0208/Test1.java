package day0208;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数求阶乘：");
		int n = new Scanner(System.in).nextInt();
		
		//n传递到f（）方法求n的阶乘
		//得到方法的返回值存到变量r
		String r = f(n);
		
		System.out.println(r);
	}

	private static String f(int n) {
		/**
		 * 假设是5
		 */
		
/*		long r = n;
		
		for(int i = n-1; i>=1;i--){
			r*=i;
		}
		return r;*/
		BigInteger r =BigInteger.valueOf(n);
		for(int i = n-1; i>=1;i--){
			r = r.multiply(BigInteger.valueOf(i));
		}
		
		return r.toString();
		
	}

}
