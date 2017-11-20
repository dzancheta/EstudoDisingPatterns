package IoC;

public class Main {

    public static void main(String[] args) {

        MyClassService myClassService = new MyClassService(new MyClassDao());
        myClassService.insereQualquerCoisa("Hello World!");

    }
}

