package org.kosta;

public interface ReversibleCommand {
	void redo();
	void undo();
}
