import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        context.start();
        System.out.println("启动。。。");
        System.in.read();
    }
}
