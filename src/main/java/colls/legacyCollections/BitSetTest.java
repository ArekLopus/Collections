package colls.legacyCollections;

import java.util.BitSet;

///This class implements a vector of bits that grows as needed.
public class BitSetTest {

	public BitSetTest() {
		
		BitSet bs = new BitSet(8);
		System.out.println(bs);
		
		bs.set(0);
		bs.set(18);
		System.out.println(bs);
		System.out.println(bs.cardinality());
		
		bs.flip(0);
		System.out.println(bs);
		
	}

	public static void main(String[] args) {
		new BitSetTest();

	}

}
