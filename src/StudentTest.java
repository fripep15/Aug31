import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StudentTest {
	
	
		 
		 public static void main(String[] args) {
			
			 Student st1=new Student("Khan", 10, 20); 
			 Student st2=new Student("Shan", 50, 50);
			 Student st3=new Student("Gul", 100, 220);
			 
			 ArrayList<Student > ar=new ArrayList( );
			 
			 ar.add(st1);
			 ar.add(st2);
			 ar.add(st3);
			 
			 Iterator it= ar.iterator()	;
			 
			 while (it.hasNext()) {
				
			 Student st=(Student)it.next();
			 
System.out.println(st.name+" ," + st.age +" "+ st.rollNo);


//System.out.println(st.name + st.age+ st.rollNo);
			 
			 }
			 

		}
		 
	}


