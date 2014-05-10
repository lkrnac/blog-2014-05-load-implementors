package net.lkrnac.blog.loadimplementors;

import java.util.List;

import net.lkrnac.blog.loadimplementors.animals.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Nature {
	List<Runner> runners;

	@Autowired
	public Nature(List<Runner> runners) {
		this.runners = runners;
	}

	public void showRunners() {
		runners.forEach(System.out::println);
	}
}
