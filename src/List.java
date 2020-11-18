import java.util.ArrayList;
import java.util.Random;


public class List {
    ArrayList<Integer> numre = new ArrayList<>();

    public static void main(String[] args) {
        int winner = 0;

        List list = new List();
        list.list_adder(15);

        System.out.println(getMax(list.numre));
        shuffle(list.numre);
        System.out.println(list.numre);

    }
    public ArrayList<Integer> doSomethingToQwe(ArrayList<Integer> list) {
        list.add(10);
        return list;
    }

    public void list_adder(int nice){
        for (int n = 0; n < nice; n++){
            numre.add(n);
        }
        for (int n = 0; n < numre.size(); n++){
        System.out.println(numre.indexOf(n));}
    }


    public static int getMax(ArrayList<Integer> list){
        int winner = 0;
        for (int i = 0; i <= list.size(); i++){
            if (winner <= list.indexOf(i)){
                winner = list.indexOf(i);
            }
        }
        return winner;
    }
    public static void shuffle(ArrayList<Integer> list){
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            Random rand = new Random();
            int select = rand.nextInt(list.size());

            temp = list.get(select);
            list.set(select,list.get(i));
            list.set(i, temp);
        }
    }

}
