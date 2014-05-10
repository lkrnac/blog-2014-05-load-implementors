package net.lkrnac.blog.loadimplementors.animals;

import org.springframework.stereotype.Service;

@Service
public class Grizzly extends Bear {
	private static final int GRIZZLY_SPEED = 10;

	@Override
	public String toString() {
		return "Grizzly []";
	}

	@Override
	public int getSpeed() {
		return GRIZZLY_SPEED;
	}
}
