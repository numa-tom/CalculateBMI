package model;

public class HealthCheckLogic {

	public void execute(Health health) {
		double height = health.getHeight();
		double weight = health.getWeight();
		double bmi =  weight/(height/100.0*height/100.0);
		bmi = ((double)Math.round(bmi * 10))/10;
		health.setBMI(bmi);

		String BodyType;
		if(bmi<18.5) {
			BodyType="痩せ型";
		}else if(bmi<25.0) {
			BodyType="普通";
		}else {
			BodyType="肥満";
		}
		health.setBody(BodyType);
	}

}
