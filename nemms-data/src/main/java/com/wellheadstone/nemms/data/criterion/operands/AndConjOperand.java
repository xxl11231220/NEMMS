package com.wellheadstone.nemms.data.criterion.operands;

public class AndConjOperand extends AbstractOperand {

	public AndConjOperand() {
	}

	@Override
	protected String toExpression() {
		return " AND ";
	}
}
