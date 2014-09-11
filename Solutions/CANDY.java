/*
 * =====ACCEPTED=====
 */
package spoj.classical;

import java.util.*;

/**
 *
 * @author Namra Saheba
 */
public class CANDY {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int blocks = Integer.parseInt(scanner.next());
        int candyPackets[];
        int i, sum, idealCandiesInEachPacket, moves;
        while (blocks != -1) {
            candyPackets = new int[blocks];
            i = 0;
            sum = 0;
            while (blocks-- > 0) {
                candyPackets[i] = Integer.parseInt(scanner.next());
                sum += candyPackets[i];
                i++;
            }
            if (sum % candyPackets.length != 0) {
                System.out.println("-1");
            } else {
                moves = 0;
                idealCandiesInEachPacket = sum / candyPackets.length;
                Arrays.sort(candyPackets);
                for ( int j = candyPackets.length - 1; candyPackets[j] > idealCandiesInEachPacket; j--  ) {
                    moves += (candyPackets[j] - idealCandiesInEachPacket);
                }
                System.out.println(moves);
            }
            blocks = Integer.parseInt(scanner.next());
        }
    }
}
