package dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConditionDto {
	
	private String userId;
	private int conditionSum;
	private Date date;  
}
