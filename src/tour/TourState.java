package tour;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import search.Action;
import search.State;

public class TourState implements State {
	protected final Set<City> visitedCities;
	protected final City currentCity;
	
	public TourState(City startCity) {
		this.visitedCities = Collections.emptySet();
		this.currentCity = startCity;
	}
	public TourState(Set<City> visitedCities, City currentCity) {
		this.visitedCities = visitedCities;
		this.currentCity = currentCity;
	}
	public Set<Road> getApplicableActions() {
		return currentCity.outgoingRoads;
	}
	public State getActionResult(Action action) {
		Road road = (Road)action;
		Set<City> newVisitedCities = new LinkedHashSet<City>(visitedCities);
		newVisitedCities.add(road.targetCity);
		return new TourState(newVisitedCities, road.targetCity);
	}

	// Task 2: Implement State Equality methods
	public boolean equals(Object that) {
		return hashCode() == that.hashCode();
	}

	public int hashCode() {
		// Two (constant) prime numbers for calculating the hash
		final int PRIME1 = 97;
		final int PRIME2 = 31;

		int hashAnswer = PRIME1;

		hashAnswer = PRIME2 * hashAnswer + hashString(currentCity.name);

		for(City city : visitedCities) {
			hashAnswer = PRIME2 * hashAnswer + hashString(city.name);
		}

		return hashAnswer;
	}

	// Auxiliary function to hash the name of a city into an integer value
	int hashString(String s) {
		final int PRIME1 = 103;
		final int PRIME2 = 37;

		int hashAnswer = PRIME1;

		for (int i = 0; i < s.length(); i++)
			hashAnswer = PRIME2 * hashAnswer + s.charAt(i);

		return hashAnswer;
	}
}
