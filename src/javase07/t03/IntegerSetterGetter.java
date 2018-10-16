package javase07.t03;

import java.util.Random;

import static java.lang.System.out;

public class IntegerSetterGetter extends Thread {

    private final SharedResource resource;
    private boolean run;
    private Random rand = new Random();

    IntegerSetterGetter(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
        run = true;
    }

    void stopThread() {
        run = false;
    }

    public void run() {

        while (run) {
            if (rand.nextBoolean()) {
                try {
                    getIntegersFromResource();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                setIntegersIntoResource();
            }
        }
        out.printf("Поток %s завершил работу.%n", getName());

    }


    private void getIntegersFromResource() throws InterruptedException {
        Integer number;

        synchronized (resource) {
            out.printf("Поток %s хочет извлечь число.%n", getName());
            number = resource.getElement();

            int counter = 0;
            while (number == null && counter < 5) {
                counter++;
                out.printf("Поток %s ждет пока очередь заполнится.%n", getName());
                resource.wait(10);
                out.printf("Поток %s возобновил работу.%n", getName());
                number = resource.getElement();
            }
            if (number == null) {
                out.printf("Поток %s не извлек число.%n", getName());
                setIntegersIntoResource(); //!
            } else {
                out.printf("Поток %s извлек число %d%n", getName(), number);
            }
        }
    }


    private void setIntegersIntoResource() {

        synchronized (resource) {
            Integer number = rand.nextInt(100);
            resource.setElement(number);
            out.printf("Поток %s записал число %d%n", getName(), number);
            resource.notify();
        }
    }
}