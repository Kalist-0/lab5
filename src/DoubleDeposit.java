public class DoubleDeposit extends Random implements ShowDate{
    int timeToDouble;
    int percent = 11;

    int random() {
        return (int) (Math.random() * 101);
    }

    int doubDep() {
        int timeToDouble = (72 / percent) + random();
        return timeToDouble;
    }

    void total() {
        System.out.println("Ваші гроші подвояться приблизно за " + doubDep() + " років.");
    }
    public void showDate() {
        System.out.println("Time - " + timeToDouble);
        System.out.println("Percent - " + percent);
    }
}
