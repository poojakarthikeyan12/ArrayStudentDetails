import java.util.ArrayList;
public class DynamicStudentData {
    public static void main (String args[]){
        ArrayList<ArrayList<String>> details= new ArrayList<ArrayList<String>>();
//        detailsnew.add("pooja");
//        detailsnew.add("vidhya");
//        detailsnew.add("karthi");
//        System.out.println("Names : "+detailsnew);
//        System.out.println("Size : "+detailsnew.size());
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("POOJA");
        s1.add("50");
        details.add(s1);
        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("VIDHYA");
        s2.add("60");
        details.add(s2);
        ArrayList<String> s3= new ArrayList<String>();
        s3.add("KARTHI");
        s2.add("70");
        details.add(s3);
        for(int i=0; i<details.size(); i++){
            for(int j=0; j<details.get(i).size(); j++){
                System.out.print(details.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }

}
