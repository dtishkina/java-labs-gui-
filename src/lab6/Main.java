package lab6;

public class Main {
    public static void main(String[] args) {
        AbstractProgram program = new AbstractProgram();
        Supervisor supervisor = new Supervisor(program);

        supervisor.start();
    }
}