public class SimpleCalculator {

        public int add(int a, int b) {
            if (a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            } else {
                return a + b;
            }
        }

        public int subtract(int a, int b) {
            if (a == 0) {
                return -b;
            } else if (b == 0) {
                return a;
            } else {
                return a - b;
            }
        }

        public int multiply(int a, int b) {
            if (a == 0 || b == 0) {
                return 0;
            } else {
                return a * b;
            }
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            } else {
                return a / b;
            }
        }

        public int power(int a, int b) {
            if (b == 0) {
                return 1;
            } else if (b == 1) {
                return a;
            } else {
                return a * power(a, b-1);
            }
        }

}
