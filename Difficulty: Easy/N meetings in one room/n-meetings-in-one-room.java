class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        Meeting[] meetings = new Meeting[n];

        // Store meetings
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        // Sort by end time
        Arrays.sort(meetings, (a, b) -> a.end - b.end);

        int count = 1;                 // First meeting selected
        int lastEnd = meetings[0].end;

        // Select remaining meetings
        for (int i = 1; i < n; i++) {
            if (meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
            }
        }

        return count;
    }
    static class Meeting {
        int start, end;
        Meeting(int s, int e) {
            start = s;
            end = e;
        }
    }
}
