interface BookOperations {
    void addBook(String title);
    void removeBook(String title);
}

interface MemberOperations {
    void registerMember(String name);
    void deleteMember(String name);
}

class BookManager implements BookOperations {
    public void addBook(String title) {
        System.out.println("Book added: " + title);
    }
    public void removeBook(String title) {
        System.out.println("Book removed: " + title);
    }
}

class MemberManager implements MemberOperations {
    public void registerMember(String name) {
        System.out.println("Member registered: " + name);
    }
    public void deleteMember(String name) {
        System.out.println("Member deleted: " + name);
    }
}

class LibraryApp {
    private BookOperations bookOps;
    private MemberOperations memberOps;

    public LibraryApp(BookOperations bookOps, MemberOperations memberOps) {
        this.bookOps = bookOps;
        this.memberOps = memberOps;
    }

    public void run() {
        bookOps.addBook("Java Programming");
        memberOps.registerMember("Alice");
    }

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp(new BookManager(), new MemberManager());
        app.run();
    }
}
