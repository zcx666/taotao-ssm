package top.zhengchunxu.config;

import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	
	@Bean
	public SimpleMessageListenerContainer messageListener() {
		
		SimpleMessageListenerContainer container=new SimpleMessageListenerContainer();
		
		return null;
	}

}
