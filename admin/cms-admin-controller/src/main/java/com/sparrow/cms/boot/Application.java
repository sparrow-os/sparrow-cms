package com.sparrow.cms.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication(scanBasePackages = "com.sparrow.*", exclude = {DataSourceAutoConfiguration.class})
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);

//        springApplication.addListeners(new ApplicationListener<ApplicationStartingEvent>() {
//            @Override public void onApplicationEvent(ApplicationStartingEvent event) {
//                Container container = ApplicationContext.getContainer();
//                //只提供proxy 代码类加速反射
//                ContainerBuilder builder = new ContainerBuilder()
//                    //只扫描com.sparrow下的类
//                    .scanBasePackage("com.sparrow")
//                    .initController(false)
//                    .initSingletonBean(false)
//                    .initInterceptor(false);
//                container.init(builder);
//                log.info("spring boot 应用程序启动前执行");
//            }
//        });

        springApplication.addListeners(new ApplicationListener<ContextRefreshedEvent>() {
            @Override
            public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
                log.info("application startup at {}", contextRefreshedEvent.getTimestamp());
            }
        });
        springApplication.addListeners(new ApplicationListener<ContextClosedEvent>() {
            @Override
            public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
                log.info("application closed at at {}", contextClosedEvent.getTimestamp());
            }
        });
        springApplication.run(args);
    }
}

