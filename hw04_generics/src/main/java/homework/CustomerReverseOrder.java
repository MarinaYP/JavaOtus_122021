package homework;


import java.util.*;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    private Deque<Customer> list = new LinkedList<>();

    public void add(Customer customer) {
        list.addFirst(customer);
    }

    public Customer take() {
        return (Customer) list.pop();
    }
}
