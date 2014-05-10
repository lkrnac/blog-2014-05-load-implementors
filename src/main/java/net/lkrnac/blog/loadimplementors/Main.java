package net.lkrnac.blog.loadimplementors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringContext.class);

		Nature nature = context.getBean(Nature.class);
		nature.showRunners();
	}
}
