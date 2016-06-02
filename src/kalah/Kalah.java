package kalah;

import com.qualitascorpus.testsupport.IO;
import com.qualitascorpus.testsupport.MockIO;

import kalah.controller.Controller;
import kalah.controller.DefaultCaptureRule;
import kalah.controller.DefaultController;
import kalah.controller.RuleSet;
import kalah.model.DefaultModel;
import kalah.model.Model;
import kalah.setting.GameSetting;
import kalah.view.DefaultView;
import kalah.view.View;

/**
 * This class is the starting point for the Modifiability Assignment.
 */
public class Kalah {
	
	public static void main(String[] args) {
		new Kalah().play(new MockIO());
	}
	
	public void play(IO io) {
		GameSetting.loadConfig();
		Model model = new DefaultModel();
		View view = new DefaultView(model, io);
		RuleSet ruleSet = new RuleSet();
		ruleSet.addRule("capture", new DefaultCaptureRule());
		Controller controller = new DefaultController(model, view, ruleSet);
		
		controller.gameStart();
	}
}
