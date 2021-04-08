package designpattern.behavioral;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Message message);
}

interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(Message message);
}

class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

class MessageSubcriberA implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("MessageSubcriberA :" + message.getMessage());
    }
}

class MessageSubcriberB implements Observer {

    @Override
    public void update(Message message) {
        System.out.println("MessageSubcriberB :" + message.getMessage());
    }
}

class MessagePublisher implements Subject {
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    @Override
    public String toString() {
        return "MessagePublisher{" +
                "observers=" + observers +
                '}';
    }
}

public class ObservablePattern {
    public static void main(String[] args) {
        Observer observer1 = new MessageSubcriberA();
        Observer observer2 = new MessageSubcriberB();

        MessagePublisher publisher = new MessagePublisher();
        publisher.attach(observer1);
        publisher.notifyUpdate(new Message("Hi Subsriber1"));
        System.out.println(publisher);

        publisher.detach(observer1);
        publisher.attach(observer2);
        publisher.notifyUpdate(new Message("Hi Subsriber2"));

        System.out.println(publisher);
    }
}
