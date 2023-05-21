package myTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> set = new HashSet<>();

		while (set.size() < 6) {
		    set.add(r.nextInt(45) + 1);
		}
		ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
		for (int num : list) {
		    System.out.print("["+num+"] ");
		}
	}
}
