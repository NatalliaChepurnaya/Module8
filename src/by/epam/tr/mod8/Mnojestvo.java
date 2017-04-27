package by.epam.tr.mod8;

import java.util.ArrayList;
import java.util.List;

public class Mnojestvo<T>{
	private List<T> set;
	private int size;
	
	public Mnojestvo(){
		set = new ArrayList<T>();
	}
	
	public Mnojestvo(T[] arr){
		set = new ArrayList<>();
		for (T v : arr){
			this.add(v);
		}
	}
	
	public boolean contains(T item){
		return set.contains(item);
	}
	
	
	@Override
	public String toString(){
		String str = "Mnojestvo:\n";
		for (T x: this.set){
			str += x + ", ";
		}
		return str;
	}
	
	public int getSize(){
		return size;
	}
	
	public void add(T item){
		if (!contains(item)){
			set.add(item);
			size++;
		}
	}
	
	public void remove(T item){
		if (contains(item)){
			set.remove(item);
			size--;
		}
		
	}
	
	public void removeAll(){
		size = 0;
		set.removeAll(set);
	}
	
	public void union(Mnojestvo<? extends T> mnoj2){
		for(T i: mnoj2.set){
			this.add(i);
		}
	}
	
	public static void main(String[] args){
		Object[] testArr = {"1",04343,(Integer)13,13,1,new String("1")};
		String[] testArr2 = {"1","new","blabkabak",new String("1")};
		Mnojestvo<Object> test = new Mnojestvo<Object>(testArr);
		Mnojestvo<String> test2 = new Mnojestvo<String>(testArr2);
		//Print set
		System.out.println(test);
		//Set size
		System.out.println(test.getSize());
		//Add new item
		test.add(new String("new"));
		System.out.println(test);
		//Delete item
		test.remove(new String("1"));
		System.out.println(test);
		//Union 2 sets
		test.union(test2);
		System.out.println(test);
		//Remove all
		test.removeAll();
		System.out.println(test);
	}
}
