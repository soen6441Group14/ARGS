package observer;

import java.util.Observable;
import java.util.Observer;

import frame.Map;
/**
 * character view
 * @author grey
 *@version 2.0
 */
public class CharacterView implements Observer{
	Map map;
	/**
	 * constructor method 
	 * @param map  the map object
	 */
	public CharacterView(Map map) {
		this.map = map;
	}
	/**
	 * update method of view to change the information
	 */
	@Override
	public void update(Observable o, Object arg) {
		
		map.drawInformation();
	}

}
