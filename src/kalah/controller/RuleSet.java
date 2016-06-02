package kalah.controller;

import java.util.HashMap;

public class RuleSet {
	private HashMap<String, Rule> rules = new HashMap<String, Rule>();
	
	public void addRule(String ruleName, Rule rule) {
		rules.put(ruleName, rule);
	}
	
	public Rule getRule(String ruleName) {
		return rules.get(ruleName);
	}

}
