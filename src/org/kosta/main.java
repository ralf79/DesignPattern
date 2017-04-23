package org.kosta;

public class Main {
    public static void main(String[] args) {
        if(args.length!=1){
            System.exit(0);
        }
        if(args[0].equals("plain")){
            TextBuilder textBuilder=new TextBuilder();
            Director director=new Director(textBuilder);
            director.construct();
            String result=textBuilder.getResult();
            System.out.println(result);
        }
        else if(args[0].equals("html")){
            HTMLBuilder htmlBuilder=new HTMLBuilder();
            Director director=new Director(htmlBuilder);
            director.construct();
            String fileName=htmlBuilder.getResult();
            System.out.println(fileName+"가 작성되었습니다!");
        }
        else{
            System.exit(0);
        }
    }
}
