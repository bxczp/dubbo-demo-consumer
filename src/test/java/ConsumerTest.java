import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bxczp.service.DemoProviderService;

public class ConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoProviderService demoProviderService=(DemoProviderService) context.getBean("demoProviderService");
        String result=demoProviderService.sayHello("���");
        System.out.println("Զ�̵��õĽ����"+result);
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        context.close();
	}
}
