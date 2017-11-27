package questao_5;

import java.util.Observable;
import java.util.Observer;

public interface View_Observer extends Observer{
	public void update(Observable o, Object obj);
}
