package org.kosta;

public class Triple {
    private int id;
    private static int num=0;
    
    private static Triple[] instance=new Triple[]{
      new Triple(), new Triple(), new Triple(),
    };
    
    private Triple(){
        System.out.println("인스턴스 생성 id : " + num);
        id=num++;
    }
    
    public int myId(){
        return id;
    }
    
    public static Triple getInstance(int id){
        if(id>=0 && id<3)
            return instance[id];
        else
            return null;
    }
}

