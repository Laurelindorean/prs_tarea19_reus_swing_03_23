/**
 * 
 */
package ejercicio4;

import java.awt.EventQueue;

/**
 * @author Palmira
 *
 */
public class MainApp {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
