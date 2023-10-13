import java.util.Scanner;
public class StudentData {
    public static void main(String[] args) {

       String details[][]; //declaration
       details = new String[3][5]; //initialization
        Scanner input = new Scanner(System.in); //scanning declaration
        int count = 1, a_mark = 0, e_mark =0, sum=0;
        int highest=0, grandtotal=0, avearge =0;
        String name="",mode,access,exam,total,bestscore ="" ;
        // Get the student name from the user
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++) {
                if(j==0) {
                    System.out.println("Enter the Student Name " + count);
                    name = input.nextLine();
                    details[i][j] = name;
                    count++;
                }
                if(j==1) {
                    System.out.println("Enter the Student mode " + name);
                    mode = input.nextLine();
                    details[i][j] = mode;
                }
                if(j==2) {
                    System.out.println("Enter the Student access mark " +name);
                    access = input.nextLine();
                    details[i][j] = access;
                    a_mark=Integer.parseInt(access);
                }
                if(j==3) {
                    System.out.println("Enter the Student Exam mark " + name);
                    exam = input.nextLine();
                    details[i][j] = exam;
                    e_mark = Integer.parseInt(exam);

                }

            }// end column
            sum = a_mark +e_mark;
            total = Integer.toString(sum);
            details[i][4]= total;

            if(sum>highest){
                highest = sum;
                bestscore = details [i][0];
            }
            grandtotal = grandtotal+sum;
        }//end row
        int size = details.length;
        avearge = grandtotal /4;

        //Print the student name
        System.out.println("The students are");
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(details[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Highest score is "+ highest + " scored by "+bestscore);
        System.out.println("Average mark of the class is "+avearge);
    }
}