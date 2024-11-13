package search;

import java.util.Set;

public interface State {
	Set<? extends Action> getApplicableActions();
	State getActionResult(Action action);

	// Task 2: State Equality functions
	boolean equals(Object that);

	int hashCode();
}
