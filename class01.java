package java_study;

import java.util.*;

public class class01 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		int[] numArray = new int[6];
		int[] rnumArray = new int[6];
		
		System.out.println("로또 번호 :");
		
		for(int i = 0; i<6; i++) {
			int num = (int)(Math.random()*45) + 1;
			numArray[i]= num;
			
			System.out.print(numArray[i]+" ");
			
		}
		
		System.out.println("");
		
		System.out.println("임의의 수 :");
		
		for(int i = 0; i<6; i++) {
			int rnum = (int)(Math.random()*45) + 1;
			rnumArray[i] = rnum;
			
			System.out.print(rnumArray[i]+" ");
		}
	} 

}


/*
  1. 객체와 클래스에 대해 서술
  2. 추상 클래스가 무엇인지
  3. 자기책임성의 원칙
  4. 프로그램 => 데이터 클래스  + 프로세스 클래스 = 실행 클래스
  5. 프로그램을 작성할 때 해야할 것 = 고정된 요소 제거 ( 변수를 사용해서 제거) , 중복된 요소 제거 ( 함수,메소드,클래스,알고리즘를 사용해서 제거 )   
  
 
 */
