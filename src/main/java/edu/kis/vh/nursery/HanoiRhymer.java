package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected; // wrongly formated
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) // wrongly formated
			totalRejected++; // wrongly formated
		else // wrongly formated
			super.countIn(in); // wrongly formated
	}
}
