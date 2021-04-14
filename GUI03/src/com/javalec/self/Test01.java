package com.javalec.self;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Generic<String> gen = new Generic<String>();
		String[] ss = {"홍길동", "이순신", "김유신"};
		
		gen.set(ss);
		gen.print();
		
		for(String s : gen.get()) {
			System.out.println(s);
		}
		
		Integer[] ii = {1,2,3};
		
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.set(ii);
		gen2.print();
		
		for(Integer o:gen2.get()) {
			System.out.println(o);
		}
		
	}
}
	
class Generic<T>{
	T[] v;

	void set(T[] n) {
		v = n;
	}
	
	public T[] get() {
		return v;
	}

	void print() {
		for (T o:v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

	
}
