package me.bishe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class BiSheApplication implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args) {
		SpringApplication.run(BiSheApplication.class, args);
	}
	@Override
	public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
		configurableEmbeddedServletContainer.setPort(8081);
	}
}
