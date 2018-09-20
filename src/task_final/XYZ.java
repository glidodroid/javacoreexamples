package task_final;

/**
 * Final variable is like constant.
 * Final variable is sometimes a blank variable where the value is initialized inside
 * a constructor.Example: Student roll number
 * Final variable not initialized even in constructor should be initialized inside the static block.
 * Final methods cannot be overriden but the method could be inherited from the super class.
 * Final class cannot be extended.
 */
public final class XYZ {

    final int value = 20;

    private final double newValue;

    public XYZ(double newValue) {
        this.newValue = newValue;
    }

    final void printValue() {

    }

}
