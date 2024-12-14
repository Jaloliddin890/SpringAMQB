package tmrv.dev.springamqb.tut1;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class Tut1Receiver {


    @RabbitHandler
    public void receive(String message) {
        System.out.println("Received: " + message);
        System.out.println(" [x] Received '" + message + "'");
    }
}
