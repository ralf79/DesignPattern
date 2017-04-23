package org.kosta;

public class Main {

	public static void main(String[] args) {
		System.out.println("싱글턴 예제1 시작");
        Singleton o1=Singleton.getInstance();
        Singleton o2=Singleton.getInstance();
        if(o1==o2){
            System.out.println("둘은 같은 인스턴스임");
        }
        else{
            System.out.println("둘은 다른 인스턴스임");
        }
        System.out.println("끝");


        System.out.println("싱글턴 예제2 시작");
        TicketMaker t1=TicketMaker.getInstance();
        TicketMaker t2=TicketMaker.getInstance();
        TicketMaker t3=TicketMaker.getInstance();
        System.out.println("t1 : "+t1.getNextTicketNumber());
        System.out.println("t2 : "+t2.getNextTicketNumber());
        System.out.println("t3 : "+t3.getNextTicketNumber());
        System.out.println("t1 : "+t1.getNextTicketNumber());
        System.out.println("끝");

        System.out.println("싱글턴 예제3 시작");
        Triple p1=Triple.getInstance(0);
        Triple p2=Triple.getInstance(1);
        Triple p3=Triple.getInstance(2);

        System.out.println("p1 아이디 : "+p1.myId());
        System.out.println("p2 아이디 : "+p2.myId());
        System.out.println("p3 아이디 : "+p3.myId());
        System.out.println("끝");

	}

}
