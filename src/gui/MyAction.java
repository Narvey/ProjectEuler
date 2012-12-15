package gui;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

public class MyAction implements Action {
	Runnable program;
	public MyAction(Runnable prog) {
		program = prog;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		program.run();
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		return (program!=null);
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean b) {
		if(!b)program = null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
