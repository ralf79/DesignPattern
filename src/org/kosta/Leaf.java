package org.kosta;

public class Leaf extends Component{
    public Leaf(String componentName) {
        super(componentName);
    }
    
    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }
}