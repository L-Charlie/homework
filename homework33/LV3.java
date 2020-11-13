package homework33;

public class LV3 {
    public static void main(String[] args) {
        business busi=new business();
        person per=new person();
        per.makeorder();
        busi.receiveorder();
        busi.delivery();
        busi.inform();
        per.receivecomputer();

    }
}
