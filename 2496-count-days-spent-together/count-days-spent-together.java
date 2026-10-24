
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int start = Math.max(
            Integer.parseInt(arriveAlice.substring(0, 2)) * 100 +
            Integer.parseInt(arriveAlice.substring(3)),
            Integer.parseInt(arriveBob.substring(0, 2)) * 100 +
            Integer.parseInt(arriveBob.substring(3))
        );

        int end = Math.min(
            Integer.parseInt(leaveAlice.substring(0, 2)) * 100 +
            Integer.parseInt(leaveAlice.substring(3)),
            Integer.parseInt(leaveBob.substring(0, 2)) * 100 +
            Integer.parseInt(leaveBob.substring(3))
        );

        if (start > end) {
            return 0;
        }

        int startMonth = start / 100;
        int startDay = start % 100;
        int endMonth = end / 100;
        int endDay = end % 100;

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int startTotal = startDay;
        for (int i = 1; i < startMonth; i++) {
            startTotal += days[i];
        }

        int endTotal = endDay;
        for (int i = 1; i < endMonth; i++) {
            endTotal += days[i];
        }

        return endTotal - startTotal + 1;
    }
}
