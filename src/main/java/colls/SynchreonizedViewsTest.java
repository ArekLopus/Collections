package colls;

import java.util.ArrayList;
import java.util.List;

//http://rayfd.me/2007/11/11/when-a-synchronized-class-isnt-threadsafe/
//-Jeśli używamy kilku metod z np. kolekcji to musimy użyć synchro bo wątek może stracić kontrolę pomiędzy wywoływaniami
public class SynchreonizedViewsTest {
	
	private List<Integer> list;
	
	public SynchreonizedViewsTest() throws InterruptedException {
		list = new ArrayList<>();		//It doesnt really matter which one we use with synchronized (list)
		//list = Collections.synchronizedList(new ArrayList<>());
		
		list.add(0);
		
		for(int i=0; i<3; i++) {
			new Thread(r).start();
		}
		
		Thread.sleep(100);
		System.out.println("Total: "+list.get(0));
	}
	
	Runnable r = () -> {
		synchronized (list) {
			for(int i=0; i<1000; i++) {
				list.set(0, list.get(0)+1);
			}
			System.out.println("Finished "+list.get(0));
		}

	};
	
	public static void main(String[] args) throws InterruptedException {
		new SynchreonizedViewsTest();
	}

}
