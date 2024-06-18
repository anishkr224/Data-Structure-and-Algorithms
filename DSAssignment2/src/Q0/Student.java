package Q0;

public class Student {
      private String name;
      private int roll;
      private double mark;
      void setStudent(String name, int roll, double mark) {
    	  this.name=name;
    	  this.roll=roll;
    	  this.mark=mark;
      }
      void display(){
    	  System.out.println("Name="+name+" Roll="+roll+" Mark="+mark);
      }
}

