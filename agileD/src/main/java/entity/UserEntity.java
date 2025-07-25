package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntity {
	private String userId;
	private String passWord;
	private int age;
	private double weight;
	private String blood;
	private double height;
	private double fatRate;
	private double sleepTime;
	private int conditionGoal;
}
