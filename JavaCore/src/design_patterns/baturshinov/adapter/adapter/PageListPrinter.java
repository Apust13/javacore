package design_patterns.baturshinov.adapter.adapter;

import java.util.List;

// интерфейс для печати списка текстов
public interface PageListPrinter {

    void print(List<String> list);
}
