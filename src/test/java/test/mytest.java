package test;


import com.myzonespringboot.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		System.out.println("TestQuartz start.");
		/*ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-job.xml");*/
		//如果配置文件中将startQuertz bean的lazy-init设置为false 则不用实例化
		//context.getBean("taskManager");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		/*QuartzJob quartzJob=new QuartzJob();
		quartzJob.work();*/
		System.out.print("TestQuartz end..");
	}


}
