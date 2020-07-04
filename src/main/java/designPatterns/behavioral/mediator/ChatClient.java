package designPatterns.behavioral.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Vladimir");
        User user2 = new UserImpl(mediator, "Svetlana");
        User user3 = new UserImpl(mediator, "Angelina");
        User user4 = new UserImpl(mediator, "Vasily");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi everyone!");
        user2.send("hello");
    }
}
