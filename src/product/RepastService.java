package product;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NoFixedFacet;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;

public class RepastService {//实现多生产者多消费者

    volatile private Semaphore setSemaphore = new Semaphore(10);//厨师
    volatile private Semaphore getSemaphore = new Semaphore(20);//用餐者
    volatile private ReentrantLock lock = new ReentrantLock();//可重入锁
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();
    //最多四个盒子存放菜品
    volatile private Object[] producePosition = new Object[4];

    private boolean isEmpty(){
        boolean isEmpty=true;
        for(int i=0; i<producePosition.length; i++){
            if(producePosition[i] != null) {
                isEmpty=false;
                break;
            }
        }
       return isEmpty;
    }

    private boolean isFull(){
        boolean isFull=true;
        for(int i=0; i<producePosition.length; i++){
            if(producePosition[i] == null) {
                isFull=false;
                break;
            }
        }
        return isFull;
    }

    public void set(){
        try{
            setSemaphore.acquire();//最多允许10个厨师进行生产
            lock.lock();
            while(isFull()){
                setCondition.wait();//满的话，要等消费者用餐后再生产
            }

            for(int i=0;i<producePosition.length;i++){
                if(producePosition[i] == null){
                    producePosition[i]="数据";
                    System.out.println(Thread.currentThread().getName()+ " 生产了 " + producePosition[i]);
                    break;
                }
            }
            getCondition.signalAll();
            lock.unlock();

        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            setSemaphore.release();
        }
    }

    public void get(){
        try{
            getSemaphore.acquire();//允许20个就餐者
            lock.lock();
            while(isEmpty()){
                getCondition.await();
            }
            for(int i=0;i<producePosition.length;i++){
                if(producePosition[i] != null){
                    System.out.println(Thread.currentThread().getName()+" 消费了 "+ producePosition[i]);
                    producePosition[i]=null;
                    break;
                }
            }
            setCondition.signalAll();
            lock.unlock();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            getSemaphore.release();
        }
    }
}
