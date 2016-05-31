package kalah.controller;

public class DefaultRuleSet implements RuleSet{
	private CaptureRule captureRule;

	@Override
	public void setCaptureRule(CaptureRule captureRule) {
		this.captureRule = captureRule;		
	}

	@Override
	public CaptureRule getCaptureRule() {
		return this.captureRule;
	}

}
