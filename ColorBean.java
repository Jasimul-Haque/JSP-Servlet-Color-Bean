package colors;

import java.io.Serializable;

public class ColorBean implements Serializable {
	private String foregroundColor="BLACK";
	private String backgroundColor="WHITE";
	public String getForegroundColor() {
		return foregroundColor;
	}
	public void setForegroundColor(String foregroundColor) {
		if(!isEmpty(foregroundColor)){
		this.foregroundColor = foregroundColor;
	}}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		if(!isEmpty(backgroundColor)){
		this.backgroundColor = backgroundColor;}
	}
	
	private boolean isEmpty(String value) {
		return((value==null)||(value.trim().equals("")));
	}

}
