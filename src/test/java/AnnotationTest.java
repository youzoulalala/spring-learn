import com.wyd.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解方式实现 IOC
 */
public class AnnotationTest {
    /**
     * 注解:代码中的特殊标记
     * 可以作用于 方法, 类, 成员变量
     * 简化 XML 配置
     *
     *
     * 创建对象的注解(效果相同)
     * @Component
     * @Controller
     * @Service
     * @Repository
     *
     * 1 引入 aop
     * 2 开启注解扫描
     *
     */
    @Test
    public void testAnnotation(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        //获取配置创建的对象
        final User user = context.getBean("user", User.class);
        user.add();
    }

    /**

     */
    @Test
    public void testAnnotation01(){
    }
}
