package structural_patterns.adapter.example1.objects;

import structural_patterns.adapter.example1.adapter.PrintAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrintAdapter printAdapter = new PrintAdapter();
        printAdapter.print(list);
    }
}
