package com.bridgelabz.Inheritance.levelone;

public class RestaurantManagementSystemWithHybridInheritance {
    public static void main(String[] args) {
        Chef chef = new Chef("Arnav", 101);
        Waiter waiter = new Waiter("Mayank", 102);

        chef.performDuties();

        System.out.println();

        waiter.performDuties();
    }
}

class StaffMember{
    private String name;
    private int id;

    public StaffMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

}

interface Worker {
    void performDuties();
}


class Chef extends StaffMember implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("the chef is performing his duties");
    }
}

class Waiter extends StaffMember implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("the waiter is server the food to the customers");
    }
}