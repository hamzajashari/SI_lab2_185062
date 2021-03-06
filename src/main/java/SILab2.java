import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public List<String> function(List<String> list) { //1
        if (list.size() <= 0) {//2
            throw new IllegalArgumentException("List length should be greater than 0");//3
        }
        List<String> numMines = new ArrayList<>();//4
        for (int i = 0; i < list.size(); i++) {//5
            if (!list.get(i).equals("#")) {//6
                int num = 0;//7
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//8
                    num++;//9
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//10
                    num++;//11
                }
                numMines.add(String.valueOf(num));//12
            } else {
                numMines.add(list.get(i));//13
            }
        }//14
        return numMines;//15
    }//16
    public static void main(String[] args) {
                  List<String> example =new ArrayList();
                  example.add("#");
                  example.add("0");
                  example.add("#");
                  example.add("0");
                  SILab2 siLab2 =new SILab2();
        System.out.println(siLab2.function(example));

    }
}

