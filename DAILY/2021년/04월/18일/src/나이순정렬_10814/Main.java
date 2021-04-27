package 나이순정렬_10814;

import java.util.*;

class Main {
static class Person implements Comparable<Person>{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		if(this.age >= o.age) {
			return 1;
		}
		else return -1;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Person> personList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			personList.add(new Person(name, age));
		}
		Collections.sort(personList);
		StringBuilder std = new StringBuilder();
		for(Person person : personList) {
			std.append(Integer.toString(person.age) + " "+ person.name+"\n");
		}
		System.out.println(std);
		String r;
		StringBuilder sss = new StringBuilder("rrWW");
		sss.
	}

}
