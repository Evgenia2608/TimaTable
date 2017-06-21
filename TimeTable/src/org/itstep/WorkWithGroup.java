package org.itstep;

import java.util.ArrayList;

public class WorkWithGroup {
	
public static void main(String[] args) {
		
		GroupOfStudents group=new GroupOfStudents();
		group.setName ("ST20");
	
		for(int i=0; i<15; i++){
		Student student=new Student (("Evgenia-"+(i+1)), ("myPass"+(i+1)), "Evgenia", "Kiev", 2);
		if(i>8){
			student=new Student (("Evgenia-"+(i+1)), ("myPass"+(i+1)), "Evgenia", "Ternopil", 4);
		}
		
		group.addStudentToGroup(student);
		
	}

System.out.println ("My best group is "+group.getName());
System.out.println("List of students:");

if (!group.getStudents().isEmpty()){
	for (Student student : group.getStudents()){
		
		switch (student.getCity()){
		case "Kiev":
		System.out.println("Login:"+student.getLogin()+" Name:"+student.getName()+".I'm from "+student.getCity());
		
		}
		
		if (!student.getCity().equals("Kiev")){
			System.out.println("Login:"+student.getLogin()+" Name:"+student.getName()+".I'm from "+student.getCity());
		}
	}
}

for (Student student:group.getStudents()){
	if(student.getCity().equals("Kiev")){
		System.out.println("Login:"+student.getLogin()+" Name:"+student.getName()+".I'm from "+student.getCity());

	}else{
		System.out.println("Login:"+student.getLogin()+" Name:"+student.getName()+".I'm from "+student.getCity());
	}
	
	
}
	}

   ArrayList<Book>books=new ArrayList();{
      Book book1=newBook ("Adamson", "Economy", 2);
      Book book2=newBook ("Robertson", "Microeconomics", 4);
      Book book3=newBook ("Richardson", "Macroeconomics", 5);
      books.add(book1);
      books.add(book2);
      books.add(book3);
   
  for (Student student: group.getStudents()){
    	  
  }
  
  for (Book oneBook:books){
	  if (oneBook.getCourse()==student.getCourse()){
		  student.setbookForStudy(oneBook);
		  break;
		  
	  }
  }
   


   


      

