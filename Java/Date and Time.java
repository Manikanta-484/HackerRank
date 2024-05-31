

class Result {
    public static String findDay(int month, int day, int year) {
          Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);  // Month is 0-based in Calendar

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }

}

