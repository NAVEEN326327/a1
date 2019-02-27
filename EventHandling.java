import java.awt.*;
import java.applet.Applet;
//<applet code="EvantHandling.java" width="300" height="300"></applet>
class EvantHandling extends Applet
{
	static final int n=4;
	public void init(){
	
		setLayout(new GridLayout(n,n));
		for(int i=0;i<n;i++){
			for(int j=0;j<n;i++){
				int k=i*n+j;
				if(k>0)
					add(new Button(""+k));
			}
		
		}
		
	}
	
}
  