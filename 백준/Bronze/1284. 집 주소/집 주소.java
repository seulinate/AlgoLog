import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int count = 0;
			String s = sc.next(); //문자열 입력받음 
			
		if(s.equals("0")) System.exit(0); //0이 입력되면 프로그램 종료
		
		for(int i=0; i<s.length(); i++) {
			String a = s.substring(i,i+1);
			
			if(a.equals("1")) count +=3; //숫자1은 너비 2 + 뒷간격 1
			else if(a.equals("0")) count +=5; //숫자0은 너비 4 + 뒷간격 1
			else count+=4; //나머지 숫자 너비 3 + 뒷간격 1
				
			}
		System.out.println(count+1); //맨앞의 간격 1
		}
		
	}
}


