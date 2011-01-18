package com.shade.bukkit.towny;

public class TownyPermission {
	boolean residentBuild, residentDestroy, outsiderBuild, outsiderDestroy, outsiderSwitches, allyBuild, allyDestroy;
	
	public TownyPermission() {
		reset();
	}
	
	public void reset() {
		setAll(false);
	}
	
	public void setAll(boolean b) {
		residentBuild = b;
		residentDestroy = b;
		outsiderBuild = b;
		outsiderDestroy = b;
		outsiderSwitches = b;
		allyBuild = b;
		allyDestroy = b;	
	}
	
	public void set(String s, boolean b) {
		if (s.equalsIgnoreCase("residentBuild"))
			residentBuild = b;
		else if (s.equalsIgnoreCase("residentDestroy"))
			residentDestroy = b;
		else if (s.equalsIgnoreCase("outsiderBuild"))
			outsiderBuild = b;
		else if (s.equalsIgnoreCase("outsiderDestroy"))
			outsiderDestroy = b;
		else if (s.equalsIgnoreCase("outsiderSwitches"))
			outsiderSwitches = b;
		else if (s.equalsIgnoreCase("allyBuild"))
			allyDestroy = b;
		else if (s.equalsIgnoreCase("allyDestroy"))
				allyDestroy = b;
	}
	
	public void load(String s) {
		String[] tokens = s.split(",");
		for (String token : tokens) {
			set(token, true);
		}
	}
	
	public String toString() {
		String out = "";
		if (residentBuild)
			out += "residentBuild";
		else if (residentDestroy)
			out += (out.length() > 0 ? "," : "") + "residentDestroy";
		else if (outsiderBuild)
			out += (out.length() > 0 ? "," : "") + "outsiderBuild";
		else if (outsiderDestroy)
			out += (out.length() > 0 ? "," : "") + "outsiderDestroy";
		else if (outsiderSwitches)
			out += (out.length() > 0 ? "," : "") + "outsiderSwitches";
		else if (allyBuild)
			out += (out.length() > 0 ? "," : "") + "allyBuild";
		else if (allyDestroy)
			out += (out.length() > 0 ? "," : "") + "allyDestroy";
		return out;
	}
}
