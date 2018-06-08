package com.ming.until;



import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.math.NumberUtils;

public enum SixEnum {
	n("ee",1),v("cc",0),wz("tt֪",-1);
	
	
	private String six;
	private Integer gender;
	
	private SixEnum(String six, Integer gender) {
		this.six = six;
		this.gender = gender;
	}
	
	public static Object getSix(Object object){
		for (SixEnum c : SixEnum.values()) {
			
			if(object instanceof Integer) {
				if (c.gender == Integer.parseInt(object.toString())) {
					return c.six;
				}
			}else if(NumberUtils.isNumber(object.toString())) {
				if (c.gender == Integer.parseInt(object.toString())) {
					return c.six;
				}
			}else if(object instanceof String){
				if (c.six.equals(object.toString())) {
					return c.gender;
				}
			}
			
		}
		return wz.six;
	}


	public String getSix() {
		return six;
	}


	public void setSix(String six) {
		this.six = six;
	}


	public Integer getGender() {
		return gender;
	}
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
