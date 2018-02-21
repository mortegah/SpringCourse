package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    public LifecycleDemoBean() {
        System.out.println("## Constructor of LifecycleDemoBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy of LifecycleDemoBean");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## setBeanName of LifecycleDemoBean name " + s);
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## afterPropertiesSet of LifecycleDemoBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## BeanFactory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("## PostContruct has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## PreDestroy has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
