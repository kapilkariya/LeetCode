class MyCalendar {
    List<List<Integer>> l;

    public MyCalendar() {
        l = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        for (int i = 0; i < l.size(); i++) {
            if (startTime < l.get(i).get(1) && endTime > l.get(i).get(0)) return false;
        }
        List<Integer> l2 = new ArrayList<>();
        l2.add(startTime);
        l2.add(endTime);
        l.add(l2);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */