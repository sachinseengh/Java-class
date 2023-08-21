
class School {
    public void fee() {
        System.out.println("Your remaining fee is 1000");
    }
}

class Exam extends School {
    public void Result() {
        System.out.println("Your result ");
    }
}

public class _5singleinheitence {
    public static void main(String[] args) {
        Exam ex = new Exam();
        ex.fee();

    }
}
