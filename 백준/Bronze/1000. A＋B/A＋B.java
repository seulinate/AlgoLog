import java.util.Scanner;

/**
 * 백준 전체 1000 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/05/21/a1000">1000 풀이</a>
 * @since 2021.04.21 Wed 21:38:17
 */
public class Main
{
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(a + b);
	}
}