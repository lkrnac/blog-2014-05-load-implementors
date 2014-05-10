package net.lkrnac.blog.loadimplementors.animals;

import org.springframework.stereotype.Service;

@Service
public class Wolf implements Runner {
	private static final int WOLF_SPEED = 0;

	@Override
	public String toString() {
		return "Wolf []";
	}

	@Override
	public int getSpeed() {
		return WOLF_SPEED;
	}
}
