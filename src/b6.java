public class b6 {
    static class User {
        private final int id;
        private String username;
        private String password;
        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }
        public int getId() {
            return id;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public void display() {
            System.out.println("ID: " + id + " Username: " + username);
        }
    }
    private static User[] users = new User[50];
    private static int count = 0;

    public static void addUser(User user) {
        if (count < users.length) {
            users[count++] = user;
        }
    }
    public static User findById(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }
    public static void showAll() {
        for (int i = 0; i < count; i++) {
            users[i].display();
        }
    }
    public static void main(String[] args) {
        User u1 = new User(1, "A", "123");
        User u2 = new User(2, "B", "321");

        addUser(u1);
        addUser(u2);
        User found = findById(2);
        if (found != null) {
            System.out.println("Tìm thấy user: " + found.getUsername());
        }
        showAll();
    }
}
