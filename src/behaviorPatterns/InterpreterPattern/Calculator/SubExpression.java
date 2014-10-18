package behaviorPatterns.InterpreterPattern.Calculator;

import java.util.HashMap;

class SubExpression extends SymbolExpression{

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var)-super.right.interpreter(var);
	}

}
