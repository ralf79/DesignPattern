package org.kosta;

import java.util.ArrayList;
import java.util.List;

public abstract class Component implements Acceptor {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	private String componentName;
	protected List<Component> children = new ArrayList<Component>();

	public Component(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentName() {
		return componentName;
	}

	public abstract void add(Component c);

	public List<Component> getChildren() {
		return children;
	}
}