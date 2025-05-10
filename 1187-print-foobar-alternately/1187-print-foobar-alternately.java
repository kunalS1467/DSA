class FooBar {
    private boolean flag=false;
    private Object object = new Object();
    private int n;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            synchronized(object){
                if(flag)object.wait();
        	    // printFoo.run() outputs "foo". Do not change or remove this line.
        	    printFoo.run();
                object.notify();
                flag = true;
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized(object){
                if(!flag)object.wait();
        	    // printBar.run() outputs "bar". Do not change or remove this line.
        	    printBar.run();
                object.notify();
                flag = false;
            }
        }
    }
}