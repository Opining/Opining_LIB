package br.com.opining.library.client.model.room.participant;

import br.com.opining.library.client.model.room.polarized.Side;

public class PolarizedDebater extends Debater{
	private Side side;

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
}
