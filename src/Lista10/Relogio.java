package Lista10;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Relogio implements Runnable {
	
	ContadorHoras contH = new ContadorHoras();
	ContadorMin contM = new ContadorMin();
	ContadorSeg contS = new ContadorSeg();

	@Override
	public void run() {		
		while(true){
			contS.contaSeg();
			if(contS.getSeg()==60){
				contM.contaMin();
				contS.setSeg(0);
			}
			if(contM.getMin()==60){
				contH.contaHora();
				contM.setMin(0);
			}
			if(contH.getHoras()==24){
				contH.setHoras(0);
			}
			
			System.out.println(contH.getHoras()+":"+contM.getMin()+":"+contS.getSeg());
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, e);
			}
		}
		
	}
}
