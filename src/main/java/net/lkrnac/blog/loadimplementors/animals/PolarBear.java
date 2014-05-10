package net.lkrnac.blog.loadimplementors.animals;

import org.springframework.stereotype.Service;

@Service
public class PolarBear extends Bear {
	private static final int POLAR_BEAR_SPEED = 9;

	@Override
	public String toString() {
		return "PolarBear []";
	}

	@Override
	public int getSpeed() {
		return POLAR_BEAR_SPEED;
	}
}
