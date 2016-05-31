package kalah.controller;

public interface RuleSet {
	void setCaptureRule(CaptureRule captureRule);
	CaptureRule getCaptureRule();
	
	//Other game rules can also be set and got here
}
