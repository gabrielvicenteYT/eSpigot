package ga.windpvp.windspigot.knockback;

public interface KnockbackProfile {

	void save();

	void save(boolean projectiles);

	String getName();

	void setName(String name);

	double getHorizontal();

	void setHorizontal(double horizontal);

	double getHorizontalMin();

	void setHorizontalMin(double horizontalMin);

	double getHorizontalMax();

	void setHorizontalMax(double horizontalMax);

	double getVertical();

	void setVertical(double vertical);

	double getVerticalMin();

	void setVerticalMin(double verticalMin);

	double getVerticalMax();

	void setVerticalMax(double verticalMax);

	double getExtraHorizontal();

	void setExtraHorizontal(double extraHorizontal);

	double getExtraVertical();

	void setExtraVertical(double extraVertical);

	double getFrictionHorizontal();

	void setFrictionHorizontal(double frictionHorizontal);

	double getFrictionVertical();

	void setFrictionVertical(double frictionVertical);

	boolean isStopSprint();

	void setStopSprint(boolean stopSprint);

	double getRodHorizontal();

	void setRodHorizontal(double rodHorizontal);

	double getRodVertical();

	void setRodVertical(double rodVertical);

	double getArrowHorizontal();

	void setArrowHorizontal(double arrowHorizontal);

	double getArrowVertical();

	void setArrowVertical(double arrowVertical);

	double getPearlHorizontal();

	void setPearlHorizontal(double pearlHorizontal);

	double getPearlVertical();

	void setPearlVertical(double pearlVertical);

	double getSnowballHorizontal();

	void setSnowballHorizontal(double snowballHorizontal);

	double getSnowballVertical();

	void setSnowballVertical(double snowballVertical);

	double getEggHorizontal();

	void setEggHorizontal(double eggHorizontal);

	double getEggVertical();

	void setEggVertical(double eggVertical);
	
	double getWTapExtraHorizontal();
	
	void setWTapExtraHorizontal(double wTapHorizontal);
	
	double getWTapExtraVertical();
	
	void setWTapExtraVertical(double wTapVertical);
	
	double getExtraSpeedHorizontal();

	void setExtraSpeedHorizontal(double extraHorizontal);

	double getExtraSpeedVertical();

	void setExtraSpeedVertical(double extraVertical);

	double getWTapExtraSpeedHorizontal();
	
	void setWTapExtraSpeedHorizontal(double wTapHorizontal);
	
	double getWTapExtraSpeedVertical();
	
	void setWTapExtraSpeedVertical(double wTapVertical);

	String[] getKnockbackValues();

	String[] getProjectilesValues();
}
