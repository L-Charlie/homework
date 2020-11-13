package homework33;

public class person implements Customer{

    @Override
    public void makeorder() {
        System.out.println("11.11日，在京东买了一台电脑，等待送达中");
    }

    @Override
    public void receivecomputer() {
        System.out.println("收到电脑了，开心！");
    }
}
