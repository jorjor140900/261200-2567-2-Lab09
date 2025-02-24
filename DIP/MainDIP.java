public class MainDIP {
    public static void main(String[] args) {
        //Create an order
        Order order = new Order("333");

        //EmailNotifier
        OrderProcessor emailOrderProcessor = new OrderProcessor(new EmailNotifier());
        emailOrderProcessor.processOrder(order);

        //SMSNotifier
        OrderProcessor smsOrderProcessor = new OrderProcessor(new SMSNotifier());
        smsOrderProcessor.processOrder(order);
    }
}
