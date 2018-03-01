public class Manager extends Employee {
    private static Manager instance;

    private Manager() {
        rank = Rank.Manager;
    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public CallHandler getCallHandler() {
        return CallHandler.getInstance();
    }
}
