package org.kosta;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
	
    
    
    public String getString(){
        return getString(0);
    }
    
    private String getString(int depth){
        StringBuffer sb = new StringBuffer();
//        if (this.getComponentName().contains("Main") || this.getComponentName().contains("sub")) {
//            for (int i = 0; i < depth; i++) {
//                sb.append("  ");
//            }
//            sb.append("+"+getComponentName() +"\n");
//            for (Component comp: children) {
//                sb.append(comp.getString(depth+1));
//            }
//        }else{
//            for (int i = 0; i < depth; i++) {
//                sb.append("  ");
//            }
//            sb.append("-"+getComponentName()+"\n");
//        }
        return sb.toString();  
    }
}
