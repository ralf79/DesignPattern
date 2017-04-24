package org.kosta;

import java.util.ArrayList;
import java.util.List;

public class JavaFinder implements Visitor {
	private List<String> javaList = new ArrayList<String>();
	private List<String> currentList = new ArrayList<String>();

	public void visit(Acceptor acceptor) {
		if (acceptor instanceof Composite) {
			Composite composite = (Composite) acceptor;
			currentList.add(composite.getComponentName());
			List<Component> children = composite.getChildren();
			for (Component component : children) {
				component.accept(this);
			}
			currentList.remove(currentList.size() - 1);
		} else if (acceptor instanceof Leaf) {
			Leaf leaf = (Leaf) acceptor;
			doSomething(leaf);
		}
	}

	protected void doSomething(Leaf leaf) {
		if (isMovie(leaf)) {
			String fullPath = getFullPath(leaf);
			javaList.add(fullPath);
		}
	}

	protected String getFullPath(Leaf leaf) {
		StringBuilder fullPath = new StringBuilder();
		for (String element : currentList) {
			fullPath.append(element).append("\\");
		}
		return fullPath.append(leaf.getComponentName()).toString();
	}

	private boolean isMovie(Leaf leaf) {
		return leaf.getComponentName().endsWith(".avi");
	}

	public List<String> getjavaList() {
		return javaList;
	}
}