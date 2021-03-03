
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();

//Avg GPA
    double sum = 0;

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student2.setName("Mariam Bahassi");
    student2.setGPA(3.5);
    student2.setMajor("Information Systems and Marketing");

student1.print();
student2.print();

ArrayList<Double> gpas = new ArrayList<Double>();
gpas.add(student1.getGPA());
gpas.add(student2.getGPA());

for (int i = 0; i < gpas.size(); i++)
 {
   sum += gpas.get(i);
  }

    System.out.println("The average GPA is: " + (sum / gpas.size()));

  }
}