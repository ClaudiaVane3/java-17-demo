package yuting.demo.records;

import java.util.Objects;

public final class RecordClass {
    final int start;
    final int end;

    public RecordClass(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordClass range = (RecordClass) o;
        return start == range.start && end == range.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "RecordClass[" + "start=" + this.start + ", end=" + this.end + ']';
    }

    public int start() {
        return start;
    }

    public int end() {
        return end;
    }
}
