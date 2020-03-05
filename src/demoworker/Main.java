package demoworker;

import content.Worker;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Worker> workerList = new ArrayList<>();
        boolean isMore = true;
        while (isMore) {

            System.out.println("enter worker number: ");
            int number = sc.nextInt();
            System.out.println("enter worker hours: ");
            int hours = sc.nextInt();
            System.out.println("enter worker rate: ");
            double rate = sc.nextDouble();

            Worker one = new Worker(number);
            one.setHours(hours);
            one.setRate(rate);

            workerList.add(one);

            System.out.println("Type 1 to continue, or any other key to end");
            if (sc.nextInt() != 1) {
                isMore = false;
            }
        }
        for (Worker sub : workerList) {
            System.out.println("worker " + sub.getNumber() + " earns " + sub.getPay());
        }

        workerList.forEach((sub) -> {
            System.out.println("worker " + sub.getNumber() + " earns " + sub.getPay());
        })

        for (int i = 0; i < workerList.size(); i++) {
            Worker two = workerList.get(i);
            System.out.println("worker " + two.getNumber() + " earns " + two.getPay());
        }

    }

}

/*
WorkerList Homework
1.	Create a project called DemoWorker that
a.	Has its main method in a class called Main
b.	Has a content folder that contains a Worker class
2.	To Worker class, add a private
a.	Integer number that is set by a constructor and has a get method
b.	Integer hours with a set method
c.	Double rate with a set method
d.	Double pay with a get method
e.	calculatePay method that
i.	does not return anything
ii.	does not take any para
iii.	sets pay = hours *rate
iv.	is called in the getPay method
3.	in main method
a.	add a Scanner object
b.	declare an ArrayList called workerList that holds Worker objects
c.	a Boolean called isMore that is set to true
d.	a while loop that will continue to loop as long as isMore is true
4.	The last line of the while loop
a.	Prompts the user to type in 1 to continue, or any other key to end
b.	If the user not types in 1, isMore is set to false
5.	Inside of the loop
a.	Prompt the user to type in a Worker number, hours and rate
b.	Create a Worker object with the data typed in
c.	Add that Worker object to workerList
6.	Below the while loop
a.	Print out all of the worker numbers and their pay

/
