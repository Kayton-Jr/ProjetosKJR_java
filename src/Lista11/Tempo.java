package Lista11;

public class Tempo {
	
	private int seg=0, min=0, hora=0;
	boolean fh=false, fm=false;
	
	public synchronized void contSeg(){
		
		while(true){
			seg++;
			if(seg==60){
				seg=0;
				fm=true;
				notifyAll();
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(hora+":"+min+":"+seg);
		}
	}
	
	public synchronized void contMin(){
		
		while(true){
			if(fm)
				min++;
			if(min==60){
				min=0;
				fh=true;
			}
			notifyAll();
			fm=false;
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void contHora(){
		
		while(true){
			if(fh)
				hora++;
			
			if(hora==24)
				hora=0;
			
			notifyAll();
			fh=false;
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
