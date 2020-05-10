import java.util.HashMap;

public class HshMap{

    public static void main(String args[]){

        HashMap myFriends = new HashMap();
        myFriends.put(1,"Devendra");
        myFriends.put(2,"Kapil");
        myFriends.put(3,"Javed");
        myFriends.put(4,"Java");

        System.out.println(myFriends + "");
        System.out.println(myFriends.get(2));

        myFriends.remove(2);

        System.out.println(myFriends.size());
    }
}