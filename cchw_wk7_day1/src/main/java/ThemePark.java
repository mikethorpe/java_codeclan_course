import Attractions.Attraction;
import Stalls.Stall;
import Visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {

	private String name;
	private ArrayList<Attraction> attractions;
	private ArrayList<Stall> stalls;

	public ThemePark(String name){
		this.name = name;
		this.attractions  = new ArrayList<>();
		this.stalls = new ArrayList<>();
	}

	public String getName(){
		return this.name;
	}

	public String visit(Visitor visitor, Attraction attraction){
		return visitor.getName() + " visited " + attraction.getName();
	}

	public void addAttraction(Attraction attraction){
		this.attractions.add(attraction);
	}

	public void addStall(Stall stall){
		this.stalls.add(stall);
	}

	public int numberOfAttractions(){
		return this.attractions.size();
	}

	public int numberOfStalls(){
		return this.stalls.size();
	}

}
