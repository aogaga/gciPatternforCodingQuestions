package slidingWindow

import spock.lang.Specification

class SlidingWindowTest extends Specification {

    SlidingWindow sl
    def setup() {
        sl =  new SlidingWindow()
    }

    def "find avergages"(){
        given:
        int [] a = [1, 3, 2, 6, -1, 4, 1, 8, 2]

        when:
       double [] result =  sl.findAverages(5, a)
       double [] r2 = sl.findAveragesV2(5, a);

        then:
        println(result);
        result == [2.2, 2.8, 2.4, 3.6, 2.8]

        println(r2);
        r2 == [2.2, 2.8, 2.4, 3.6, 2.8]

    }

    def "find max sub array"(){
        given:
        int [] a = [2, 1, 5, 1, 3, 2]
        int [] b = [2, 3, 4, 1, 5]

        when:
        int resulta = sl.findMaxSumSubArray(3, a)
        int resultb = sl.findMaxSumSubArray(2, b)

        then:

        resulta == 9

        println(resultb)

    }


    def "find Minimum SubArray"(){
        given:
        int []  a  = [2, 1, 5, 2, 8]

        when:
        int result = sl.findMinSubArray(7, a);

        then:
        result == 1
    }
}
