package com.example.index;

import android.app.Activity;
import android.content.Intent;

public class ActivityTo {
	/**
	 * 結束此Activity，起始另一Activity
	 * @param F 結束的Activity.this
	 * @param A 起始的Activity.class
	 */
	public static void doFinishAndStart(Activity F, Class<?> A) {
		Intent intent = new Intent();
		intent.setClass(F, A);
		F.finish();
		F.startActivity(intent);
	}
	
	/**
	 * 不結束此Activity，起始另一Activity
	 * @param F 來源的Activity.this
	 * @param A 起始的Activity.class
	 */
	public static void doStart(Activity F, Class<?> A) {
		Intent intent = new Intent();
		intent.setClass(F, A);
		F.startActivity(intent);
	}
}
