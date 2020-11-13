package homework33;

public class business implements JD{

    @Override
    public void receiveorder() {
        System.out.println("尊敬的客户，正在处理您的订单");
    }

    @Override
    public void delivery() {
        System.out.println("包裹已经发出，快递小哥正在运输中----");
        try
        {
            Thread.sleep(2000);
        } catch (Exception e){
        }
    }

    @Override
    public void inform() {
        System.out.println("已经送达，满意请给五星好评~");
    }
}
