package com.tka.arraycustomobject;

public class ArrayWithCustomObject {
	public static void main(String[] args) {
		Student student1 = new Student(101,"Mihir",26);
		Student student2 = new Student(102,"Ruby",-25);
		Student student3 = new Student(103,"Myrub",26);
		Student student4 = new Student(104,"Myr",-25);
		Student student5 = new Student(105,"Roop",-27);
		
		Student[] studentArray = new Student[5];
		studentArray[0] = student1;
		studentArray[1] = student2;
		studentArray[2] = student3;
		studentArray[3] = student4;
		studentArray[4] = student5;
		
		
//		System.out.println("Accessed using for loop");
//		for(int i =0;i<studentArray.length;i++) {
//			System.out.println(studentArray[i]);
//		}
		
		System.out.println("--------------------------");
		System.out.println("Using for Each");
		System.out.println("Student Update by age with 5 increment");
		for(Student student:studentArray) {
			int age = student.getAge();
			if(age<0) {
				int updateAge =student.getAge()*-1;
				student.setAge(updateAge);
			}
			System.out.println(student);
		}

		//		for (Student student : studentArray) {
//			int updateAge =student.getAge()*-1;
//			int updateAge = student.getAge()+5;
			//student.setAge(updateAge);
			//System.out.println(student);
			
			//System.out.println(student);
			//System.out.println(student.getAge()+5);
		//}
		
	}

}
