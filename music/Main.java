package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Music obj = new Music();
		List<Music> lst = obj.getPlayList();

		System.out.print("PlayList: ");
		for (Music m : lst) {
			System.out.print(m.getSong() + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String input = sc.next();
			Music m1 = new Music(input);

			obj.rotateList(lst);
			lst.set(lst.size() - 1, m1);

			for (Music m : lst) {
				System.out.print(m.getSong() + " ");
			}
			System.out.println();
		}
	}
}
