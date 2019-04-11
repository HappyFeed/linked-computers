package model;

public class Computer {
    int hg;
    int ram;
    String ip;
    
    public Computer(int hg, int ram, String ip) {
    	this.hg=hg;
    	this.ram=ram;
    	this.ip=ip;
    }

	public int getHg() {
		return hg;
	}

	public void setHg(int hg) {
		this.hg = hg;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
    
}
