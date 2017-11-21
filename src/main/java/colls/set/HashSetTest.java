package colls.set;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetTest {

	public HashSetTest() throws IOException {
		
		String str = new String(Files.readAllBytes(Paths.get("alice.txt")), StandardCharsets.UTF_8);
		//System.out.println(str.substring(0,150));
		List<String> words = Arrays.asList(str.split("[\\P{L}]+"));
		System.out.println(words.size());
		System.out.println(words.stream().collect(Collectors.toSet()).size());
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		new HashSetTest();
		Set<String> words = new HashSet<>(); // HashSet implements Set
		//Set<String> words = new TreeSet<>();
		//List<String> words = new ArrayList<>();
		long totalTime = 0;
		
		Scanner in = new Scanner(Paths.get("alice.txt"));
		while (in.hasNext()) {
			String word = in.next();
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
		}
		in.close();
		
		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 3 && iter.hasNext(); i++)
		System.out.print(iter.next()+", ");
		System.out.println(". . .");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
	}

}
