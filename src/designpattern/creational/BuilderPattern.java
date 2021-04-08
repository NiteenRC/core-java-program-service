package designpattern.creational;

public class BuilderPattern {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder(1, "Niteen")
                .lastName("Chougula")
                .build();

        User user2 = new User.UserBuilder(2, "Nit")
                .build();//lastName is optional

        System.out.println(user1);
        System.out.println(user2);
    }
}

class User {
    private final int id;
    private final String firstName;
    private final String lastName;

    User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    static class UserBuilder {
        private int id;
        private String firstName;
        private String lastName;


        UserBuilder(int id, String firstName) {
            this.id = id;
            this.firstName = firstName;
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
