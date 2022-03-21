class Arithmetic {
    private int a;
    private int b;


    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
            public int Sum() {
            return a + b;
        }

        public int Multiplication() {
            return this.a * this.b;
        }

        public int Max() {
            if (this.a > this.b)
                return this.a;
            return this.b;
        }
    public int Min() {
        if (this.a > this.b)
            return this.b;
        return this.a;
    }
    }

