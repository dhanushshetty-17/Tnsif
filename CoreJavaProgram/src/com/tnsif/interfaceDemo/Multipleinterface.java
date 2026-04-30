package com.tnsif.interfaceDemo;

interface Camera{
	void takephoto();
}

interface Musicplayer{
	void playmusic();
}
class Smartphone implements Camera,Musicplayer{

	@Override
	public void takephoto() {
		// TODO Auto-generated me
		System.out.println("Taking pht");
		
	}

	@Override
	public void playmusic() {
		System.out.println("playin music ");// TODO Auto-generated method stub
		
	}
	
}
public class Multipleinterface {
	public static void main(String[] args) {
		Smartphone s=new Smartphone();
		s.takephoto();
		s.playmusic();
	}

}
