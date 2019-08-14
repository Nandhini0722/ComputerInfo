package org.com;

public class Desktop implements HardWare,SoftWare {
     public void desktopModel() {
    	 System.out.println("Desktop Model...");
     }
     public void hardWareResource() {
    	 System.out.println("HardWare Resource...");
     }
     public void softWareResource() {
    	 System.out.println("SoftWare Resource...");
     }
     public static void main(String[] args) {
    	 Desktop a=new Desktop();
    	 a.desktopModel();
    	 a.hardWareResource();
    	 a.softWareResource();
     }
}
