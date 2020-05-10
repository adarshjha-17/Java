
import java.util.ArrayList;

public class ArayList{

    public static void main(String args[]){

        // Without data type array list

        ArrayList myFamily = new ArrayList();
        myFamily.add(4);
        myFamily.add("Adarsh");
        myFamily.add("Ashu");
        myFamily.add("Bhagirath");

        System.out.println(myFamily + "");

        // With data type ArrayList

        ArrayList<String> myFriends = new ArrayList<String>();
        myFriends.add("Kapil");
        myFriends.add("Piyush");
        myFriends.add("Ravi");
        myFriends.add("Ankur");
        myFriends.add("Devendra");

        System.out.println(myFriends + "");
    }
}