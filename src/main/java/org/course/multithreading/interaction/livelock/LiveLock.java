package org.course.multithreading.interaction.livelock;

public class LiveLock {

    static class Spoon {
        private Eater owner;

        public Spoon(Eater owner) {
            this.owner = owner;
        }

        public Eater getOwner() {
            return this.owner;
        }

        public synchronized void setOwner(Eater owner) {
            this.owner = owner;
        }

        public synchronized void use() {
            System.out.println(owner.name + " ест");
        }
    }

    static class Eater {
        private final String name;
        private boolean isHungry = true;

        public Eater(String name) {
            this.name = name;
        }

        public void eatWithFriend(Spoon spoon, Eater friend) {
            while (isHungry) {
                if (spoon.getOwner() != this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }

                if (friend.isHungry) {
                    System.out.println(name + ": ты первая, " + friend.name);
                    spoon.setOwner(friend);
                    continue;
                }

                spoon.use();
                isHungry = false;
                System.out.println(name + ": я поела");
                spoon.setOwner(friend);
            }
        }
    }

    public static void main(String[] args) {
        final Eater masha = new Eater("Masha");
        final Eater dasha = new Eater("Dasha");
        final Spoon spoon = new Spoon(masha);

        new Thread(() -> masha.eatWithFriend(spoon, dasha)).start();
        new Thread(() -> dasha.eatWithFriend(spoon, masha)).start();
    }
}
