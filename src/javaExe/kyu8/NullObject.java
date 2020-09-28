package javaExe.kyu8;

public class NullObject {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public boolean equals(Object obj) {
        NullObject nullObject = (NullObject) obj;
        return obj == null || (nullObject.hashCode() == this.hashCode());
    }

    public boolean equals2(Object other) {
        return other == null || other instanceof NullObject;
    }
}
