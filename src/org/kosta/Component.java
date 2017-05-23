package org.kosta;

import java.awt.Composite;
import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	
    private String componentName;
    protected List<Component> children = new ArrayList<Component>();
    
    
    public Component(String componentName) {
        this.componentName = componentName;
    }
    
    public String getComponentName() {
        return componentName;
    }
    
    public abstract void add(Component c);
    
    public List<Component> getChildren(){
        return children;
    }
    
    public String getString(){
        return getString(0);
    }
    
    private String getString(int depth){
        StringBuffer sb = new StringBuffer();
        if (this.getComponentName().contains("Main") || this.getComponentName().contains("sub")) {
            for (int i = 0; i < depth; i++) {
                sb.append("  ");
            }
            sb.append("+"+getComponentName() +"\n");
            for (Component comp: children) {
                sb.append(comp.getString(depth+1));
            }
        }else{
            for (int i = 0; i < depth; i++) {
                sb.append("  ");
            }
            sb.append("-"+getComponentName()+"\n");
        }
        return sb.toString();  
    }
}