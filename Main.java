package ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0 , 10);
        myList.add(1 , 11);
        myList.add( 7, 12);
        myList.add(19);
        myList.add(18);
        myList.add(17);
        myList.add(16);
        myList.add(4,-1);
        System.out.println(myList.get(2));
    }
}
