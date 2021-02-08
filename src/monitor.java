import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class monitor {
	
	private final Lock bloqueo = new ReentrantLock();
	
	public void crucePuenteNorte() {
		bloqueo.lock();
		try {
			
		}finally {
			bloqueo.unlock();
		}
	}
	
	public void crucePuenteSur() {
		bloqueo.lock();
		try {
			
		}finally {
			bloqueo.unlock();
		}
	}
	
}
