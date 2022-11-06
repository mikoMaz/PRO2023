package second.shortcuts;

import java.util.List;

public class ClassThatHaveItAll implements InterfaceOne {
    String name;
    Integer number;

    public ClassThatHaveItAll(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public void printMe(String info) {
        List<Long> list;
    }
}
