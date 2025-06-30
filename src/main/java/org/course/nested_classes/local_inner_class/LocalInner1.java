package org.course.nested_classes.local_inner_class;

import java.lang.constant.DynamicConstantDesc;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);
    }
}

class Math{
    private int a = 101010;
    public void getResult(final int delimoe, final int delitel){
//        int delimoe = 21;

        class Delenie{ /* Не может быть static! */
            /*private int delimoe;*/
//            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

            public int getChastnoe(){
                return delimoe/delitel;
            }

            public int getOstatok(){
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
//        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
        System.out.println(a);
    }
}
