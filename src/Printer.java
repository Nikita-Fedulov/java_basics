public class Printer {
    private String queue ="";
    private int pendingPagesCount=0; //кол-во стр.
    private int pendingPagesCountAllTime=0;
    private int countQueue = 0;
    public void append(String text){append(text,"",1);}
    public void append(String text, String name){append(text,name,1);}
    public void append(String text, String name, int count){
        queue = queue + "\n" + text + "\n" +
                name + "\n" + count + "стр.";
        pendingPagesCount = pendingPagesCount + count;
        countQueue++;

    }
    public void clear() {
        queue = "";
        pendingPagesCount=0;
            }
    public void print() {
        if (queue.isEmpty()) {
            System.out.println("-");
        } else {
            System.out.println(queue);
            countQueue = 0;
            pendingPagesCountAllTime = pendingPagesCount;
            System.out.println("Общее количество страниц напечатанных: " + pendingPagesCountAllTime);
        }

    }
    public int getPendingPagesCount(){
        return pendingPagesCount;
    }

    public String getQueue() {
        return queue;
    }

    public int getCountQueue() {
        return countQueue;
    }
    public int getPendingPagesCountAllTime(){
        return pendingPagesCountAllTime;
    }

}
