package ga.windpvp.windspigot.knockback;

import ga.windpvp.windspigot.knockback.KnockbackProfile;

public class CraftKnockbackProfile implements KnockbackProfile {

	private String name;
	private final String saveProfilePath;

	private double horizontal = 0.4D;
	private double horizontalMin = 0.4D;
	private double horizontalMax = 0.4D;
	private double vertical = 0.4D;
	private double verticalMin = -1.0D;
	private double verticalMax = 0.4D;
	private double extraHorizontal = 0.5D;
	private double extraVertical = 0.1D;
	private double frictionHorizontal = 2.0D;
	private double frictionVertical = 2.0D;

	private boolean stopSprint = true;

	private double rodHorizontal = 0.4D;
	private double rodVertical = 0.4D;
	private double arrowHorizontal = 0.4D;
	private double arrowVertical = 0.4D;
	private double pearlHorizontal = 0.4D;
	private double pearlVertical = 0.4D;
	private double snowballHorizontal = 0.4D;
	private double snowballVertical = 0.4D;
	private double eggHorizontal = 0.4D;
	private double eggVertical = 0.4D;
	
	private double wTapExtraHorizontal = 0.5;
	private double wTapExtraVertical = 0.1;
	
	private double extraSpeedHorizontal = 0;
	private double extraSpeedVertical = 0;

	public CraftKnockbackProfile(String name) {
		this.name = name;
		this.saveProfilePath = "knockback.profiles." + this.name;
	}

	@Override
	public void save() {
		save(false);
	}
	
	private void set(String savePath, Object value) {
		KnockbackConfig.set(saveProfilePath + savePath, value);
	}

	@Override
	public void save(boolean projectiles) {

		set(".stop-sprint", this.stopSprint);
		set(".friction-horizontal", this.frictionHorizontal);
		set(".friction-vertical", this.frictionVertical);
		set(".horizontal", this.horizontal);
		set(".horizontal-min", this.horizontalMin);
		set(".horizontal-max", this.horizontalMax);
		set(".vertical", this.vertical);
		set(".vertical-min", this.verticalMin);
		set(".vertical-max", this.verticalMax);
		set(".extra-horizontal", this.extraHorizontal);
		set(".extra-vertical", this.extraVertical);
		
		set(".wtap-extra-horizontal", this.wTapExtraHorizontal);
		set(".wtap-extra-vertical", this.wTapExtraVertical);
		
		set(".add-horizontal", this.extraSpeedHorizontal);
		set(".add-vertical", this.extraSpeedVertical);
		
		if (projectiles) {
			set(".projectiles.rod.horizontal", this.rodHorizontal);
			set(".projectiles.rod.vertical", this.rodVertical);
			set(".projectiles.arrow.horizontal", this.arrowHorizontal);
			set(".projectiles.arrow.vertical", this.arrowVertical);
			set(".projectiles.pearl.horizontal", this.pearlHorizontal);
			set(".projectiles.pearl.vertical", this.pearlVertical);
			set(".projectiles.snowball.horizontal", this.snowballHorizontal);
			set(".projectiles.snowball.vertical", this.snowballVertical);
			set(".projectiles.egg.horizontal", this.eggHorizontal);
			set(".projectiles.egg.vertical", this.eggVertical);
		}

		KnockbackConfig.save();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getHorizontal() {
		return horizontal;
	}

	@Override
	public void setHorizontal(double horizontal) {
		this.horizontal = horizontal;
	}

	@Override
	public double getHorizontalMin() {
		return horizontalMin;
	}

	@Override
	public void setHorizontalMin(double horizontalMin) {
		this.horizontalMin = horizontalMin;
	}

	@Override
	public double getHorizontalMax() {
		return horizontalMax;
	}

	@Override
	public void setHorizontalMax(double horizontalMax) {
		this.horizontalMax = horizontalMax;
	}

	@Override
	public double getVertical() {
		return vertical;
	}

	@Override
	public void setVertical(double vertical) {
		this.vertical = vertical;
	}

	@Override
	public double getVerticalMin() {
		return verticalMin;
	}

	@Override
	public void setVerticalMin(double verticalMin) {
		this.verticalMin = verticalMin;
	}

	@Override
	public double getVerticalMax() {
		return verticalMax;
	}

	@Override
	public void setVerticalMax(double verticalMax) {
		this.verticalMax = verticalMax;
	}

	@Override
	public double getExtraHorizontal() {
		return extraHorizontal;
	}

	@Override
	public void setExtraHorizontal(double extraHorizontal) {
		this.extraHorizontal = extraHorizontal;
	}

	@Override
	public double getExtraVertical() {
		return extraVertical;
	}

	@Override
	public void setExtraVertical(double extraVertical) {
		this.extraVertical = extraVertical;
	}

	@Override
	public double getFrictionHorizontal() {
		return frictionHorizontal;
	}

	@Override
	public void setFrictionHorizontal(double frictionHorizontal) {
		this.frictionHorizontal = frictionHorizontal;
	}

	@Override
	public double getFrictionVertical() {
		return frictionVertical;
	}

	@Override
	public void setFrictionVertical(double frictionVertical) {
		this.frictionVertical = frictionVertical;
	}

	@Override
	public boolean isStopSprint() {
		return stopSprint;
	}

	@Override
	public void setStopSprint(boolean stopSprint) {
		this.stopSprint = stopSprint;
	}

	@Override
	public double getRodHorizontal() {
		return rodHorizontal;
	}

	@Override
	public void setRodHorizontal(double rodHorizontal) {
		this.rodHorizontal = rodHorizontal;
	}

	@Override
	public double getRodVertical() {
		return rodVertical;
	}

	@Override
	public void setRodVertical(double rodVertical) {
		this.rodVertical = rodVertical;
	}

	@Override
	public double getArrowHorizontal() {
		return arrowHorizontal;
	}

	@Override
	public void setArrowHorizontal(double arrowHorizontal) {
		this.arrowHorizontal = arrowHorizontal;
	}

	@Override
	public double getArrowVertical() {
		return arrowVertical;
	}

	@Override
	public void setArrowVertical(double arrowVertical) {
		this.arrowVertical = arrowVertical;
	}

	@Override
	public double getPearlHorizontal() {
		return pearlHorizontal;
	}

	@Override
	public void setPearlHorizontal(double pearlHorizontal) {
		this.pearlHorizontal = pearlHorizontal;
	}

	@Override
	public double getPearlVertical() {
		return pearlVertical;
	}

	@Override
	public void setPearlVertical(double pearlVertical) {
		this.pearlVertical = pearlVertical;
	}

	@Override
	public double getSnowballHorizontal() {
		return snowballHorizontal;
	}

	@Override
	public void setSnowballHorizontal(double snowballHorizontal) {
		this.snowballHorizontal = snowballHorizontal;
	}

	@Override
	public double getSnowballVertical() {
		return snowballVertical;
	}

	@Override
	public void setSnowballVertical(double snowballVertical) {
		this.snowballVertical = snowballVertical;
	}

	@Override
	public double getEggHorizontal() {
		return eggHorizontal;
	}

	@Override
	public void setEggHorizontal(double eggHorizontal) {
		this.eggHorizontal = eggHorizontal;
	}

	@Override
	public double getEggVertical() {
		return eggVertical;
	}

	@Override
	public void setEggVertical(double eggVertical) {
		this.eggVertical = eggVertical;
	}

	@Override
	public String[] getKnockbackValues() {
		return new String[] { "Horizontal??7: " + this.horizontal, "Horizontal-Min??7: " + this.horizontalMin, "Horizontal-Max??7: " + this.horizontalMax, "Vertical??7: " + this.vertical,
				"Vertical-Max??7: " + this.verticalMax, "Vertical-Min??7: " + this.verticalMin,
				"Extra-Horizontal??7: " + this.extraHorizontal, "Extra-Vertical??7: " + this.extraVertical,
				"Friction-Horizontal??7: " + this.frictionHorizontal, "Friction-Vertical??7: " + this.frictionVertical,
				"Stop-Sprint??7: " + this.stopSprint, "Wtap-Extra-Horizontal??7: " + this.wTapExtraHorizontal,
				"Wtap-Extra-Vertical??7: " + this.wTapExtraVertical, "Speed-Extra-Horizontal??7: " + this.extraSpeedHorizontal,
				"Speed-Extra-Vertical??7: " + this.extraSpeedVertical };
	}

	@Override
	public String[] getProjectilesValues() {
		return new String[] { "Rod-Horizontal??7: " + this.rodHorizontal, "Rod-Vertical??7: " + this.rodVertical,
				"Arrow-Horizontal??7: " + this.arrowHorizontal, "Arrow-Vertical??7: " + this.arrowVertical,
				"Pearl-Horizontal??7: " + this.pearlHorizontal, "Pearl-Vertical??7: " + this.pearlVertical,
				"Snowball-Horizontal??7: " + this.snowballHorizontal, "Snowball-Vertical??7: " + this.snowballVertical,
				"Egg-Horizontal??7: " + this.eggHorizontal, "Egg-Vertical??7: " + this.eggVertical, };
	}

	@Override
	public double getWTapExtraHorizontal() {
		return wTapExtraHorizontal;
	}

	@Override
	public void setWTapExtraHorizontal(double wtapHorizontal) {
		this.wTapExtraHorizontal = wtapHorizontal;
	}

	@Override
	public double getWTapExtraVertical() {
		return wTapExtraVertical;
	}

	@Override
	public void setWTapExtraVertical(double wTapVertical) {
		this.wTapExtraVertical = wTapVertical;
	}

	@Override
	public double getExtraSpeedHorizontal() {
		return extraSpeedHorizontal;
	}

	@Override
	public void setExtraSpeedHorizontal(double extraSpeedHorizontal) {
		this.extraSpeedHorizontal = extraSpeedHorizontal;
	}

	@Override
	public double getExtraSpeedVertical() {
		return extraSpeedVertical;
	}

	@Override
	public void setExtraSpeedVertical(double extraSpeedVertical) {
		this.extraSpeedVertical = extraSpeedVertical;
	}

	@Override
	public double getWTapExtraSpeedHorizontal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWTapExtraSpeedHorizontal(double wTapHorizontal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWTapExtraSpeedVertical() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWTapExtraSpeedVertical(double wTapVertical) {
		// TODO Auto-generated method stub
		
	}
}
