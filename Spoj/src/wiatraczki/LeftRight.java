package wiatraczki;

import java.util.ArrayDeque;


class LeftRight {
	ArrayDeque<Integer> list = new ArrayDeque<>();

	public void right() {
		int n = list.pollFirst();
		String core[][] = new String[2 * n][2 * n];

		for (int i = 0; i < core.length; i++) {
			for (int j = 0; j < core.length; j++) {
				if (i == j || i + j == core.length - 1 || (i > j && i < core.length - n)
						|| (i < j && i > core.length - n - 1)
						|| (j > core.length - n - 1 && i < core.length - n && i + j < core.length - 1)
						|| (j < core.length - n && i > core.length - n && i + j > core.length - 1)) {

					core[i][j] = "*";
				} else {
					core[i][j] = ".";
				}
				System.out.print(core[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

	public void left() {
		int n = list.pollFirst();
		int m = Math.abs(n);
		String core[][] = new String[2 * m][2 * m];

		for (int i = 0; i < core.length; i++) {
			for (int j = 0; j < core.length; j++) {
				if (i == j || i + j == core.length - 1 || (j < core.length - m && i - j < core.length - 2 * m)
						|| (j > core.length - m - 1 && i - j > core.length - 2 * m)
						|| (j < core.length - m && i > core.length - m - 1 && i + j < core.length - 1)
						|| (j > core.length - m - 1 && i < core.length - m && i + j > core.length - 1)) {

					core[i][j] = "*";
				} else {
					core[i][j] = ".";
				}
				System.out.print(core[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
