public static long contarHanoi(int n) {
    return (long)Math.pow(2, n) - 1;
}

public static long contarHanoiBucle(int n) {
    long total = 1;
    for (int i = 1; i <= n; i++) {
        total *= 2;
    }
    return total - 1;
}

void main() {
}
