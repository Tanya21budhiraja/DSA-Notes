package Array;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // we are searching for a gas station where if we start we can reach the same
        // index with given fuel
        // like in first case if i start from [1] it will be 1 - 3[cost] = -2
        // similarly for rest
        // but for 4 we can reach 4 again

        int total = 0;
        int startindex = 0;
        int fuel = 0;
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            fuel += diff;

            if (fuel < 0) {
                startindex = i + 1;
                fuel = 0;
            }
        }
        return total < 0 ? -1 : startindex;

    }

}
