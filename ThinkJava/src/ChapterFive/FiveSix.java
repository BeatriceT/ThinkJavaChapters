package ChapterFive;

/**
 * 3. The value of parameter blimp is "rattle"
 * 4.   ik
 *      rattle
 *      ping zoop
 *      boo-wa-ha-ha
*/
public class FiveSix {



    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {

        if (flag < 0) {
            System.out.println(quince + " zoop");           //3 ping zoop
        } else {
            System.out.println("ik");                       //1 ik
            baffle(quince);                                 //2 rattle
            System.out.println("boo-wa-ha-ha");             //4 boo-wa-ha-ha

        }

    }
}

