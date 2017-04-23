package org.kosta;

public class TextBuilder implements Builder{
    private StringBuffer buffer=new StringBuffer();
    @Override
    public void makeTitle(String title) {
        buffer.append("============================\n");
        buffer.append("¡º"+title+"¡»");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("¡á"+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(int i=0; i<items.length; i++){
            buffer.append("  ¢Á"+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("============================\n");
    }
    public String getResult(){
        return buffer.toString();

    }
}
