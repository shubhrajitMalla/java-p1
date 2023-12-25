
public class h5 {

	public static void main(String[] args) {
		int W = 1, J = 2, K = 3, A = 4;
		W = W + J + K + A;
		A = W - (J + K + A);
		K = W - (J + K + A);
		J = W - (J + K + A);
		W = W - (J + K + A);
		System.out.println(W + " " + J + " " + K + " " + A);

	}
}
