import com.wyd.User;
import com.wyd.bean.Emp;
import com.wyd.config.SpringConfig;
import com.wyd.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注解方式实现 IOC
 */
public class AnnotationTest {

    public static final String BEAN_10_XML = "bean10.xml";

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
        ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_10_XML);
        Emp emp = context.getBean("employee", Emp.class);
        System.out.println(emp);
    }


    /**
     * 依赖注入
     * @Qualifier("userDao") 配合@Autowired使用，根据bean id注入
     * @Autowired 根据类型注入
     * @Resource 根据类型或者bean id注入
     * @Value 普通字段注入
     */
    @Test
    public void testAnnotation01(){
        ApplicationContext context = new ClassPathXmlApplicationContext(BEAN_10_XML);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User("蔡徐坤"));
    }

    /**
     * 完全注解开发
     */
    @Test
    public void testAnnotation02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);//配置类
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User("蔡徐坤"));
    }
}
