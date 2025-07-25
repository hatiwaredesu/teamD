package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConditionEntity {
	private String userId;
	private int conditionSum;
	private Date date;  
}
