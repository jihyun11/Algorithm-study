import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    public ListClientExample() {
        list = new ArrayList<>(); // 이 부분만 바꾸면 리스트 종류별로 바꿔 끼울 수 있음
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list1 = lce.list;
        System.out.println(list1);
    }
}
