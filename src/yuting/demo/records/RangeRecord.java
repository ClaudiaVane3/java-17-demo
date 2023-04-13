package yuting.demo.records;

public record RangeRecord(int start, int end) {

    public int getRange() {
        return Math.abs(end - start);
    }

    public static void main(String... args) {
        var rangeRecord = new RangeRecord(0, 1);
        var rangeRecord2 = new RangeRecord(0, 1);
        var rangeRecord3 = new RangeRecord(1, 2);
        System.out.println(rangeRecord.start());
        System.out.println(rangeRecord.end());
        System.out.println(rangeRecord);
        System.out.println(rangeRecord.equals(rangeRecord2));
        System.out.println(rangeRecord.equals(rangeRecord3));
        System.out.println(rangeRecord.getRange());
    }
}
