package generic;

public class TimeReminder<T>{
    public T time;

    public TimeReminder(T time){
        this.time = time;
    }

    public void notice(){
        System.out.println("대기시간이 " + time + "만큼 남았습니다.");
    }
}