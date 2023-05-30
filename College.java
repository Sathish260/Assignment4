package org.college;

public class College {
	
	public void CollageName() {
		System.out.println("Sastra");
	}
	public void CollageCode() {
		System.out.println("266");
	}
	public void CollageRank() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		
		College details=new College();
		
		details.CollageRank();
		details.CollageCode();
		details.CollageName();

	}

}