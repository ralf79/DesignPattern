package org.kosta;

public class TicketMaker {
    private static TicketMaker singleton=new TicketMaker();
    
    private int ticket=1000;
    
    private TicketMaker(){
        System.out.println("인스턴스 생성!");
    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    //콜할 때마다 티켓이 하나씩 증가
    public int getNextTicketNumber(){
        return singleton.ticket++;
    }
}

