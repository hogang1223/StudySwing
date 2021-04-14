package com.javalec.self;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Member02> mb = new ArrayList<Member02>();
		
		// list 추가
		Member02 mb1 = new Member02();
		mb1.setName("홍길동");
		mb1.setId("hong");
		mb1.setPassword("hong1234");
		mb1.setAge(40);
		
		mb.add(mb1);
		
		// list 추가
		Member02 mb2 = new Member02();
		mb2.setName("이순신");
		mb2.setId("lee");
		mb2.setPassword("leee1234");
		mb2.setAge(30);
		
		mb.add(mb2);
		
		// list 추가
		Member02 mb3 = new Member02();
		mb3.setName("김유신");
		mb3.setId("kim");
		mb3.setPassword("kimm1234");
		mb3.setAge(20);
		
		mb.add(mb3);
		
		
		// 출력
		for(int i=0; i<mb.size(); i++) {
			System.out.println("이름 : " + mb.get(i).getName()
					+ "\t아이디 : " + mb.get(i).getId()
					+ "\t비밀번호 : " + mb.get(i).getPassword()
					+ "\t나이 : " + mb.get(i).getAge());
		}
		
	}
}
