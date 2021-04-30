package Java_0507Hw;

//2018213043 ¾È¼¼¶ó

class Name {
	private String sung;
	private String irum;
	
	
	public void setSung(String sung) {
		this.sung = sung;
	}
	
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	
	public String getSung() {
		return sung;
	}
	
	public String getIrum() {
		return irum;
	}
	
	public int length() {
		return irum.length() + sung.length();
	}
}
