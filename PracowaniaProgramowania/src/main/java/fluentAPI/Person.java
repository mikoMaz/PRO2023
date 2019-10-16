package fluentAPI;

import fluentAPI.interfaces.IPerson;
import fluentAPI.interfaces.Title;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person implements IPerson {

    List<Person> friends = new ArrayList<>();
    String name;
    Enum title;

    Person(String name, fluentAPI.interfaces.Title title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public IPerson addFriend(Person friend) {
        this.friends.add(friend);
        return this;
    }

    @Override
    public IPerson sayHelloToFriends() {
        for (Person friend : this.friends) {
            System.out.println("HELLO " + friend.name);
        }
        return this;
    }

    @Override
    public IPerson processFriends(Function<List<Person>, List<Person>> processor) {
        processor.apply(this.friends);
        return this;
    }

    @Override
    public IPerson chooseBestFriend(Function<List<Person>, Person> picker) {
        Person bestFriend = picker.apply(this.friends);
        return bestFriend;
    }

    @Override
    public void print() {
        System.out.println(this.title + " " + this.name);
    }
}