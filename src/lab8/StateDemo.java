package lab8;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current State: " + context.getState());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current State: " + context.getState());
    }
}
