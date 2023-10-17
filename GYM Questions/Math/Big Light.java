import java.util.*;

// https://course.acciojob.com/idle?question=80372ff2-d510-4320-8c56-3871c81fcc60

public class Main {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		if (v1 == v2) {
			if (h1 == h2) // same height
				System.out.println("true");
			else
				System.out.println("false");
		} else {
			if ((h1 - h2) % (v2 - v1) == 0 && (h1 - h2) / (v2 - v1) > -1)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}
