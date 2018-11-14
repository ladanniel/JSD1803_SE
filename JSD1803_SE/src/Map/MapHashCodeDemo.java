package Map;

import java.util.HashMap;

/**
 * 作为key类，如果不很好的重写equals和HashCode方法会造成HashMap工作故障；
 * @author live
 *
 */
public class MapHashCodeDemo {
	
	public static void main(String[] args) {
		HashMap<Player,String> map = new HashMap<Player,String>();
		map.put(new Player(1),"吃鸡");
		map.put(new Player(2),"英雄联盟");
		map.put(new Player(3),"crossfire");
		map.put(new Player(4),"英雄联盟");
		Player one = new Player(1);
		String game = map.get(one);
		System.out.println(game);
		
		Player two  = new Player(4);
		String game2 = map.get(two);
		System.out.println(game2);
		
	}
	
}

class Player{
	int id;
	public Player(int id){
		this.id=id;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
