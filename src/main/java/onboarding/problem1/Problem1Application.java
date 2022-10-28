package onboarding.problem1;

import java.util.List;

import onboarding.problem1.application.PlayerService;
import onboarding.problem1.application.ScoreService;
import onboarding.problem1.application.Validation;
import onboarding.problem1.application.bookgame.BookGameValidation;
import onboarding.problem1.config.BookGameDependencyConfigurer;
import onboarding.problem1.exception.BookGameException;
import onboarding.problem1.model.Player;

public class Problem1Application {

	private final PlayerService playerService;
	private final ScoreService scoreService;

	public Problem1Application(BookGameDependencyConfigurer bookGameConfig) {
		this.playerService = bookGameConfig.playerService();
		this.scoreService = bookGameConfig.scoreService();
	}

	public int play(List<Integer> pages1, List<Integer> pages2) {
		if (validateBookGame(pages1, pages2)) {



		}

		return -1;
	}

	private boolean validateBookGame(List<Integer> pages1, List<Integer> pages2) {
		BookGameValidation bookGameValidation = new BookGameValidation();

		if (bookGameValidation.validate(pages1)
			&& bookGameValidation.validate(pages2)) {
			return true;
		}

		return false;
	}

}
