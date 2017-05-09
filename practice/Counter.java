package practice;

public class Counter {
	int i=0;
	String id;
	Counter(String id) {
		this.id = id;
	}
	public void increment(){
		i++;
	}
	public int tally(){
		return i;
	}
	public String toString(){
		return i+" "+id;
		
	}
}
