package List;

import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {

        List<String> nameList = new java.util.ArrayList<>();

        nameList.add("kiran");
        nameList.add("Prem");
        nameList.add("saravanan");
        nameList.add(1,"kavitha");
        nameList.add("vinoth");
        nameList.add(null);
        nameList.add(null);

        for(String item : nameList){
            System.out.println("item====>" + item);
        }

        nameList.remove(1);

        for(int i=0; i<nameList.size(); i++){
            System.out.println("for loop===>" + nameList.get(i));
        }

        nameList.clear();

        System.out.println("nameList====>" + nameList);




    }
}
