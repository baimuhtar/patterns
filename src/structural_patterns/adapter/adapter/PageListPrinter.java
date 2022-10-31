package structural_patterns.adapter.adapter;

import java.util.List;
// интерфейс для печати списка
public interface PageListPrinter {
    void print(List<String> list);
}