import com.wyd.Book;
import com.wyd.Order;
import com.wyd.User;
import com.wyd.bean.Dept;
import com.wyd.bean.Emp;
import com.wyd.bean.FactoryBean;
import com.wyd.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC: 控制反转
 * Bean管理：对象创建，依赖注入
 * 实现方式： XML, annotation
 */
public class IocTest {
    /**
     * 测试set方法注入依赖
     */
    @Test
    public void testDI01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        final Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    /**
     * 有参构造函数注入
     */
    @Test
    public void testDI02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        final Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    /**
     * 注入外部Bean
     */
    @Test
    public void testDI03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User("刘德华"));
    }

    /**
     * 注入内部Bean
     */
    @Test
    public void testDI04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        final Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    /**
     * 注入集合类
     */
    @Test
    public void testDI05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        final Dept dept = context.getBean("dept", Dept.class);
        System.out.println(dept);
    }

    /**
     * FactroyBean
     * 返回结果与自身不同
     */
    @Test
    public void testDI06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
//        final FactoryBean myFactoryBean = context.getBean("myFactoryBean", FactoryBean.class);
//        System.out.println(myFactoryBean);
        final Emp emp = context.getBean("myFactoryBean", Emp.class);
        System.out.println(emp);
    }

    /**
     * Bean 生命周期 Scope
     */
    @Test
    public void testDI07(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        final Order order1 = context.getBean("order", Order.class);
        final Order order2 = context.getBean("order", Order.class);
        System.out.println(order1==order2);
        final Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    /**
     * Bean 生命周期,每一步
     */
    @Test
    public void testDI08(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        final Book book = context.getBean("book", Book.class);
        System.out.println("第六步,获取使用对象:"+book);
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 自动装配 autowire
     */
    @Test
    public void testDI09(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        com.wyd.autowire.Emp emp = context.getBean("emp", com.wyd.autowire.Emp.class);
        System.out.println(emp);
    }


    /**
     * 引入外部配置文件
     */
    @Test
    public void testDI10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        com.alibaba.druid.pool.DruidDataSource druidDataSource = context.getBean("druidDataSource", com.alibaba.druid.pool.DruidDataSource.class);
        System.out.println(druidDataSource);
    }
}
